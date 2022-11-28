package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Winder", 10000.00);
        System.out.println("empleado1 = " + empleado1.toString());

        Cliente cliente1 = new Cliente("Winder",'M',22,"Escallon villa", true,
                new Date());
        System.out.println("cliente1 = " + cliente1);
    }
}
