import ar.edu.unlu.poo.tp2.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("Juan", "Perez", "123456",
                "111111", LocalDate.of(1990, 12, 12), 100000);

        Pasante pasante = new Pasante("Camila", "Martinez", "234565",
                "222222", LocalDate.of(1997, 5, 07));

        PorHora porHora = new PorHora("Pedro", "Picapiedra", "345678",
                "333333", LocalDate.of(1987, 9, 23), 800, 160);

        PorComision porComision = new PorComision("Leo", "Paredes", "98765",
                "444444", LocalDate.of(1996, 10, 19), 30);
        porComision.agregarVentas(100000);

        SalarioBase salarioBase = new SalarioBase("Pepe", "Argento", "345678",
                "555555", LocalDate.of(1978, 5, 14), 20, 40000);
        salarioBase.agregarVentas(100000);
        System.out.println("ASALARIADO: \nsueldo: " + asalariado.calcularSueldo() + "\nbono cumpleanos: "
        + asalariado.calcularBonoCumpleanos() + "\n");

        System.out.println("PASANTE: \nsueldo: " + pasante.calcularSueldo() + "\nbono cumpleanos: "
                + pasante.calcularBonoCumpleanos() + "\n");

        System.out.println("POR HORA: \nsueldo: " + porHora.calcularSueldo() + "\nbono cumpleanos: "
                + porHora.calcularBonoCumpleanos() + "\n");

        System.out.println("POR COMISION: \nsueldo: " + porComision.calcularSueldo() + "\nbono cumpleanos: "
                + porComision.calcularBonoCumpleanos() + "\n");

        System.out.println("SALARIO BASE: \nsueldo: " + salarioBase.calcularSueldo() + "\nbono cumpleanos: "
                +
                salarioBase.calcularBonoCumpleanos() + "\n");
    }

}