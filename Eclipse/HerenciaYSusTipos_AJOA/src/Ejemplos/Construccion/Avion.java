package Ejemplos.Construccion;

public class Avion{
	
    int alas;
    int ruedas;
    int altura;
    boolean cola;
    
    public void Descender(){
        System.out.println("Esta decendiendo");
    }
    
    public void setAlas(int alas){
         this.alas=alas;
    }
    
    public int getAlas(){
        return alas;
    }
    
    public int getRuedas(){
        return ruedas;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public boolean getCola(){
        return cola;
        
    }   
}
