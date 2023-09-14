import ar.edu.unlu.poo.tp2.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(14);
        Cuadrado cuadrado = new Cuadrado(4);
        Rectangulo rectangulo = new Rectangulo(4,6);
        Triangulo triangulo = new Triangulo(4,6);

        ArrayList<Figura> figuras2d = new ArrayList<>();
        figuras2d.add(circulo);
        figuras2d.add(cuadrado);
        figuras2d.add(rectangulo);
        figuras2d.add(triangulo);
        String res1 = "";
        for (Figura figura : figuras2d){
            res1 += "Area del " + figura.getNombre() + ": " + figura.getArea() + "\n";
        }
        System.out.println(res1);

        Esfera esfera = new Esfera(14);
        Paralelepipedo paralelepipedo = new Paralelepipedo(3,5,7);
        Cubo cubo = new Cubo(4);
        Tetraedro tetraedro = new Tetraedro(4);
        ArrayList<Figura3d> figuras3d= new ArrayList<>();
        figuras3d.add(esfera);
        figuras3d.add(paralelepipedo);
        figuras3d.add(cubo);
        figuras3d.add(tetraedro);

        String res2 = "";
        for (Figura3d figura : figuras3d){
            res2 += "Area " + figura.getNombre() + ": " + figura.getArea() + "\n";
            res2 += "Volumen " + figura.getNombre() + ": " + figura.getVolumen() + "\n";
        }
        System.out.println(res2);
    }
}