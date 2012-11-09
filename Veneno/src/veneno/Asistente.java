
package veneno;


public class Asistente {
    private String nombre;
    private Copa copa;

    public Asistente(String nombre) {
        this.nombre = nombre;
    }

    public void setCopa(Copa copa) {
        this.copa = copa;
    }
    
    
    
    public String beber(){
        String mensaje;
        if (copa.isVeneno()){
            mensaje = "Estoy muerto!";
        }else
        {
            mensaje = "Qué buen vino";
        }
        return "Soy " + nombre + "y digo:" + mensaje;
    }
    
}
