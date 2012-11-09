package conejo;

public class Ninho {

    private String nombre;
    private int edad;
    private Conejo conejo;

    public Ninho(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
       
    }
    
    public void vinoConConejo(String nombreConejo){
        this.conejo = new Conejo(nombreConejo);
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String tocarOreja(){
        String mensaje = "";
        mensaje += "Soy " + nombre + " y estoy tocando la oreja ";
        mensaje += "al conejo " + conejo.getNombre();
        mensaje += " y el me dice: " + conejo.moverCola();        
        return mensaje;
    }
    
    public String mostrarZanahoria(){
       String mensaje = "";
        mensaje += "Soy " + nombre + " y estoy mostrando una zanahoria ";
        mensaje += "al conejo " + conejo.getNombre();
        mensaje += " y el me dice: " + conejo.acercarse();        
        return mensaje;
    }
   
    
}
