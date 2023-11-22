package Ejemplos.Especificacion;

public class AnimalControladora {
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Puppy", 1, "Maltez");
        miPerro.hacerSonido(); 
        miPerro.ladrar(); 

        System.out.println("Nombre del perro: " + miPerro.obtenerNombre());

        Gato miGato = new Gato("Mandarino", 3, true);
        miGato.hacerSonido(); 
        miGato.maullar(); 

        System.out.println("Edad del gato: " + miGato.obtenerEdad());
    }
 }
    