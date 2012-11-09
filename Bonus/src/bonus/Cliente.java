
package bonus;


public class Cliente {
    private String nombre;
    private int puntos;

    public Cliente(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    
    
public String consultarPuntos(){
    return "Usted tiene " + puntos;
}    
    
    
    
    
    
}
