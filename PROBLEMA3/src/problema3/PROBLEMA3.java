/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author Mauricio
 */
public class PROBLEMA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ocho = new int[]{ 223,243,100,200,200,155,300,150 };
        int[] diez = new int[]{ 340,355,223,243,130,240,260,155,302,130 };
        int[] leche = new int[]{ 30,34,28,45,31,50,29,1 };
        int[] lechee = new int[]{ 45,50,34,39,29,40,30,52,31,1 };
        
        
        int sum = 0;
        for (int i = 0; i < ocho.length ; i++) {
            sum+=ocho[i];
        }
        System.out.println("Array Sum = "+sum);
        

        Scanner enter = new Scanner(System.in);
        int n,pr;
        String ps,prod;
        
        System.out.println("Ingrese el número de vacas disponibles:");
        n = enter.nextInt();
        
        System.out.println("Ingrese el peso límite del camión:");
        pr = enter.nextInt();
        
        System.out.println("Ingrese el peso de vacas separado por , :");
        ps = enter.nextLine();
        String[] aSplit = ps.split(","); 
        
        System.out.println("Ingrese la producción de leche por vaca separado por, :");
        prod = enter.nextLine();
        String[] Split = prod.split(",");
        
        System.out.println(aSplit);
        
        
        
        
    }
    
}
