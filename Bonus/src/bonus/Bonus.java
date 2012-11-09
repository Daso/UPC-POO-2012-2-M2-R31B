
package bonus;


public class Bonus {

    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Carlos", 100);
        Cliente cliente2 = new Cliente("Sonia", 90);
        Cliente cliente3 = new Cliente("Pedro", 10);
        
        
        System.out.println(cliente1.consultarPuntos());
        
}
}