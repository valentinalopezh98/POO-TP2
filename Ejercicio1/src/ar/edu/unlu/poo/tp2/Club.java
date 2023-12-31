package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Club {
    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Actividad> actividades = new ArrayList<>();

    public boolean agregarActividad(String nombre, TipoSuscripcion suscripcion){
        for (Actividad actividad : actividades){
            if (actividad.getNombre().equals(nombre)){
                return false;
            }
        }
        Actividad actividad1 = new Actividad(nombre,suscripcion);
        actividades.add(actividad1);
        return true;
    }

    public boolean agregarSocio(String nombre, String apellido, String direccion,
                                String mail, String dni, TipoSuscripcion tipo){
        for (Socio socio : socios){
            if (socio.getDni().equals(dni)){
                return false;
            }
        }
        Socio socio1 = new Socio(nombre,apellido,direccion,mail,dni,tipo);
        socios.add(socio1);
        return true;
    }

    private int obtenerMes(Mes mes) {
        int res;
        switch (mes) {
            case ENERO:
                res = 1;
                break;
            case FEBRERO:
                res = 2;
                break;
            case MARZO:
                res = 3;
                break;
            case ABRIL:
                res = 4;
                break;
            case MAYO:
                res = 5;
                break;
            case JUNIO:
                res = 6;
                break;
            case JULIO:
                res = 7;
                break;
            case AGOSTO:
                res = 8;
                break;
            case SEPTIEMBRE:
                res = 9;
                break;
            case OCTUBRE:
                res = 10;
                break;
            case NOVIEMBRE:
                res = 11;
                break;
            case DICIEMBRE:
                res = 12;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }

    public String reporteMensual(Mes mes){
        int mesIndicado = obtenerMes(mes);
        String magentaColor = "\u001B[35m";
        String resetColor = "\u001B[0m";
        String reporte = magentaColor + "SOCIOS INSCRIPTOS EN EL MES DE " + mes + "\n" + resetColor;

        LocalDate actual = LocalDate.now();
        for (Socio socio : socios){
            if (socio.getFechaInscripcion().getMonthValue() == mesIndicado){
                reporte += socio.getNombre() + " " + socio.getApellido() + " (" +
                        socio.getFechaInscripcion() + ")\n";
            }
        }
        return reporte;
    }

    public String listadoActividades(){
        String magentaColor = "\u001B[35m";
        String cyanColor = "\u001B[36m";
        String resetColor = "\u001B[0m";
        String listado = magentaColor + "LISTADO DE ACTIVIDADES\n\n" + cyanColor + "SUSCRIPCION BASICA:\n" + resetColor;
        for (Actividad actividad : actividades){
            if (actividad.getSuscripcion().equals(TipoSuscripcion.BASICA))
            listado += actividad.getNombre() + " (" + actividad.getSuscripcion()
                    + ")\n";
        }
        listado += cyanColor + "\nSUSCRIPCION INTERMEDIA:\n" + resetColor;
        for (Actividad actividad : actividades){
            if (actividad.getSuscripcion().equals(TipoSuscripcion.INTERMEDIA))
                listado += actividad.getNombre() + " (" + actividad.getSuscripcion()
                        + ")\n";
        }
        listado += cyanColor + "\nSUSCRIPCION DESTACADA:\n" + resetColor;
        for (Actividad actividad : actividades){
            if (actividad.getSuscripcion().equals(TipoSuscripcion.DESTACADA))
                listado += actividad.getNombre() + " (" + actividad.getSuscripcion()
                        + ")\n";
        }
        return listado;
    }


    public String listadoSocios(){
        String magentaColor = "\u001B[35m";
        String cyanColor = "\u001B[36m";
        String resetColor = "\u001B[0m";
        String listado = magentaColor + "LISTADO DE SOCIOS\n\n" + cyanColor + "SUSCRIPCION BASICA:\n" + resetColor;
        for (Socio socio : socios){
            if (socio.getSuscripcion().equals(TipoSuscripcion.BASICA))
            listado += socio.getNombre() + " " + socio.getApellido() + " (" +
                    socio.getSuscripcion() + ")\n";
        }
        listado += cyanColor + "\nSUSCRIPCION INTERMEDIA\n" + resetColor;
        for (Socio socio : socios){
            if (socio.getSuscripcion().equals(TipoSuscripcion.INTERMEDIA))
                listado += socio.getNombre() + " " + socio.getApellido() + " (" +
                        socio.getSuscripcion() + ")\n";
        }
        listado += cyanColor + "\nSUSCRIPCION DESTACADA\n" + resetColor;
        for (Socio socio : socios){
            if (socio.getSuscripcion().equals(TipoSuscripcion.DESTACADA))
                listado += socio.getNombre() + " " + socio.getApellido() + " (" +
                        socio.getSuscripcion() + ")\n";
        }
        return listado;
    }

    public boolean abonarCuota(int numSocio, TipoSuscripcion tipo){
        for (Socio socio : socios){
            if (socio.getNumSocio() == numSocio && socio.getSuscripcion().equals(tipo)){
                socio.abonar();
                return true;
            }
        }
        return false;
    }
}
