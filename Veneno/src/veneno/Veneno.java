
package veneno;


public class Veneno {

   
    public static void main(String[] args) {
       Asistente asistente01 = new Asistente("Sir Richard");
       Asistente asistente02 = new Asistente("Lady Perkins");
       Asistente asistente03 = new Asistente("Sir Bruno");
       Asistente asistente04 = new Asistente("Sir Artur");
        
       Copa copa01 = new Copa(false); 
       Copa copa02 = new Copa(false);
       Copa copa03 = new Copa(true);
       Copa copa04 = new Copa(false);
       
       asistente01.setCopa(copa01);
       asistente02.setCopa(copa03);
       asistente03.setCopa(copa02);
       asistente04.setCopa(copa04);
       
       System.out.println(asistente01.beber());
       System.out.println(asistente02.beber());
       System.out.println(asistente03.beber());
       System.out.println(asistente04.beber());
        
    }
}
