
package mathclass;
import java.lang.Math;


public class MathClass {
//Math.random() return random number from 0 to 1//*10

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Math.max(2.3, 5.5));
        System.out.println(Math.max(4, 7));
        System.out.println(Math.min(4, 7));
        System.out.println(Math.pow(3, 3));
        System.out.println(Math.log(6));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));//return random number from 0 to 99
        System.out.println(50+(int)(Math.random()*50));//returns random number from 50 to 99
        
       
    }
    

}