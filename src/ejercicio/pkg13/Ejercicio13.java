
package ejercicio.pkg13;

import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int nven;
       int sum=0;
       int temp=0;
       
        System.out.println("¿Cuantas ventas se realizaron?"); 
        nven=sc.nextInt();
        int ven[]=new int[nven];
        for(int a=0;a<ven.length;a++){
            System.out.println("Inngreser el valor de la venta");
            ven[a]=sc.nextInt();
            
            sum+=ven[a];
        }
        System.out.println("El total de las ventas es igual a: " +sum);
        
    }
    
}
