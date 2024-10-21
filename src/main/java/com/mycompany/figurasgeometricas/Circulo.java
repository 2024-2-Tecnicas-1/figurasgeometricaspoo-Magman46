package com.mycompany.figurasgeometricas;
public class Circulo extends FiguraGeometrica {
    protected double radio;

    public Circulo(String nombre, String color,double radio) {// O(1)
        super(nombre, color);
        this.radio = radio;
    }
    @Override
    public void obtenerArea() {// O(1)
        super.obtenerArea();
        System.out.println("El Area es: "+((radio*2)*Math.PI));

    }

    @Override
    public void obtenerPerimetro() {// O(1)
        super.obtenerPerimetro();
        System.out.println("El perimetro es: "+(Math.PI*2*radio));
    }

    public void setRadio(double radio) {// O(1)
        this.radio = radio;
    }
    
}
