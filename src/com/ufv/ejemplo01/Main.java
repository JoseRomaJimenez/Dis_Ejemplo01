package com.ufv.ejemplo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        //Declaramos una variable tipo scanner para leer la consola
        Scanner sc = new Scanner(System.in);

        //Lee lo que has escrito en la consola declarando ese string
        System.out.println("Escribe tu nombre");
        p.setNombre(sc.nextLine());

        System.out.println("Escribe tu apellido");
        p.setApellidos(sc.nextLine());

        System.out.println("Escribe tu edad");
        p.setEdad(sc.nextInt());

        System.out.println("Escribe tu dni");
        p.setDni(sc.nextInt());

        System.out.println("Bienvenido!: " + p.getNombre() + p.getApellidos());
        System.out.println("Tienes unos fabulosos: " + p.getEdad() + " años");
        System.out.println("Y tu dni sin la letra es: " + p.getDni());
    }
}
