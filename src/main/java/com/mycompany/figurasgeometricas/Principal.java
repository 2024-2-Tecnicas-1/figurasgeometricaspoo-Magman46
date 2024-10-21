package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String Figura="";
        double valor;
        System.out.println("Ingrese el nombre de la figura");
        do{ // O(n)
            System.out.println("Triangulo, Circulo o Rectangulo");
            Figura=sc.nextLine();
        }while (!Figura.equalsIgnoreCase("Triangulo") && !Figura.equalsIgnoreCase("Circulo") && !Figura.equalsIgnoreCase("Rectangulo"));
        System.out.println("Ingrese el color del "+Figura);
        String Color=sc.nextLine();
        
        
    // O(1)
        if (Figura.equalsIgnoreCase("Triangulo")) {
            Triangulo triangulo = new Triangulo(Figura,Color,0,0);
            System.out.println("ingrese la base del triangulo");
            valor=sc.nextDouble();
            triangulo.setBase(valor);
            System.out.println("ingrese la altura del triangulo");
            valor=sc.nextDouble();
            triangulo.setAltura(valor);
            triangulo.obtenerPerimetro();
            triangulo.obtenerArea();
        }else if (Figura.equalsIgnoreCase("Circulo")) {
            Circulo circulo = new Circulo(Figura,Color,0);
            System.out.println("Ingrese el radio del circulo");
            valor=sc.nextDouble();
            circulo.setRadio(valor);
            circulo.obtenerPerimetro();
            circulo.obtenerArea();
        }else{
            Rectangulo rectangulo = new Rectangulo(Figura,Color,0,0);
            System.out.println("Ingrese el valor para el lado 1 del rectangulo");
            valor=sc.nextDouble();
            rectangulo.setLado1(valor);
            System.out.println("Ingrese el valor para el lado 2 del rectangulo");
            valor=sc.nextDouble();
            rectangulo.setLado2(valor);
            rectangulo.obtenerPerimetro();
            rectangulo.obtenerArea();
        }
    }
}
