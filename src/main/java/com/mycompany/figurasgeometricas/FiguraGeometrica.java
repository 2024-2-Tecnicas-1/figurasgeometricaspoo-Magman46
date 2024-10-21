
package com.mycompany.figurasgeometricas;
public class FiguraGeometrica {
   protected String nombre; 
   protected String color;
   
   public FiguraGeometrica(String nombre, String color)// O(1)
   {
       this.color = color;
       this.nombre = nombre;
   }
     
   public void getNombre()// O(1)
   {
       System.out.println(this.nombre);
   }
   public void getColor()// O(1)
   {
       System.out.println(this.color);
   }
   
   public void obtenerPerimetro(){}// O(1)
   public void obtenerArea(){}// O(1)
   
}
