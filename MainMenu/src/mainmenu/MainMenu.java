/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainmenu;
import java.util.Scanner;
/**
 *
 * @author Mauricio
 */
public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        System.out.println("MENÚ");
        System.out.println("1. Problema 1");
        System.out.println("2. Problema 2");
        System.out.println("3. Problema 3");
        int c = choose.nextInt();
        if(c==1){
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
        else if(c==2){
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
        else if(c==3){
            
        }
    }
    
}
