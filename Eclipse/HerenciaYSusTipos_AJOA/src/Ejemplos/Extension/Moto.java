package Ejemplos.Extension;

public class Moto extends Vehiculos {
    
    private boolean tieneMaletero;

    public Moto(String marca, String modelo, boolean tieneMaletero) {
        super(marca, modelo);
        this.tieneMaletero = tieneMaletero;
    }

    public void realizarAcrobacias() {
        System.out.println("Realizando acrobacias en la motocicleta.");
    }
    
}