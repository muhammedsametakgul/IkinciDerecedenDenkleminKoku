
package ikinci.dereceden.kök.bulma;

import java.util.Scanner;
public class İkinciDerecedenKökBulma {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        double a,b,c,x1,x2,delta;
        System.out.println("a:");
        a =klavye.nextDouble();
        System.out.println("b:");
        b=klavye.nextDouble();
        System.out.println("c:");
        c = klavye.nextDouble();
        
        delta = b*b-4*a*c;
        if(delta==0){
        x1=(-b/2*a);
        System.out.println("kökleri eşittir ve kökü="+x1);
        }else if(delta>0){
           x1=(-b + Math.sqrt(delta))/(2*a);
           x2=(-b - Math.sqrt(delta))/(2*a);
           System.out.println("iki reel kökü vardır ve köklerinden biri :" +x1);
           System.out.println("iki reel kökü vardır ve köklerinden biri :"+ x2);
           
        }else{
        System.out.println("reel kökü yoktur");
        }
        
        
    }
    
}
