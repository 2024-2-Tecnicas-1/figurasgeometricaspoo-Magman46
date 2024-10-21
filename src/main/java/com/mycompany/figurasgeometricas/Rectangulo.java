package com.mycompany.figurasgeometricas;
public class Rectangulo extends FiguraGeometrica {
    
    protected double lado1;
    protected double lado2;

    public Rectangulo(String nombre, String color,double lado1, double lado2) {// O(1)
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public void obtenerArea() {// O(1)
        super.obtenerArea();
        System.out.println("El Area es: "+(lado1*lado2));

    }

    @Override
    public void obtenerPerimetro() {// O(1)
        super.obtenerPerimetro();
        System.out.println("El perimetro es: "+(lado1*2+lado2*2));
    }

    public void setLado1(double lado1) {// O(1)
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {// O(1)
        this.lado2 = lado2;
    }
    
}
