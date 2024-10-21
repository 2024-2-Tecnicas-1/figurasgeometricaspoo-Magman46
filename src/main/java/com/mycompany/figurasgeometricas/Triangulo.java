package com.mycompany.figurasgeometricas;
public class Triangulo extends FiguraGeometrica {
    
    protected double base;
    protected double altura;

    public Triangulo(String nombre, String color,double base, double altura) {// O(1)
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void obtenerArea() {// O(1)
        super.obtenerArea();
        System.out.println("El Area es: "+((base*altura)/2));

    }

    @Override
    public void obtenerPerimetro() {// O(1)
        super.obtenerPerimetro();
        System.out.println("El perimetro es: "+(base*3));
    }
    
    public void setBase(double base) {// O(1)
        this.base = base;
    }

    public void setAltura(double altura) {// O(1)
        this.altura = altura;
    }
    
    
}
