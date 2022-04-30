/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import java.util.Scanner;
/**
 *
 * @author Mauricio
 */
public class PROBLEMA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int i;
        
        System.out.println("Ingrese el número impar:");
        i = enter.nextInt();
        
        if(i %2 == 0){
                System.out.println("Ingrese un número válido");
            }
            else{
                for(int j = 1; j<= i ; j++){
                    for(int z = 1; z <= i-j ; z++){
                        System.out.print(" ");
                    }
                    for(int y = 1; y <=(j*2)-1; y++){
                        System.out.print("*");
                    }
                    System.out.println();
                }}
    }  
}
