package conejo;

public class Conejo {
    private String nombre;

    public Conejo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String moverCola(){
        return "Soy " + nombre + " y estoy moviendo la cola";
    }
  
    public String acercarse(){
        return "Soy " + nombre + " y me estoy acercando";
    }
   
}
