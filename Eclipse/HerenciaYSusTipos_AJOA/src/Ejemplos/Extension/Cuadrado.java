package Ejemplos.Extension;

public class Cuadrado extends Figuras {
    
    int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    public void area(){
        int resultado = lado*lado;
        System.out.println("El area del cuadrado es: " + resultado);
    }
    
}
