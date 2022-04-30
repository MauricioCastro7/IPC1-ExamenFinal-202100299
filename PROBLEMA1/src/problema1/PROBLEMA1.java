/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class PROBLEMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int i,j;
        
        System.out.println("Ingrese el primer número");
        i = enter.nextInt();
        System.out.println("Ingrese el segundo número");
        j = enter.nextInt();
        
        if(i >= j){
                System.out.println(i +" es mayor a "+j);
            }
            else{
                System.out.println(j+" es mayor a "+i);
            }
    }
    
}
