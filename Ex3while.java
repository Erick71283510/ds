/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3while;

/**
 *
 * @author CAMARGO
 */
public class Ex3while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=1; 
        while(n1<=100)
        {
            if (n1 % 2 != 0 )
            {
                System.out.println("esses sao os numeros impares:"+n1);
            }
            n1++;
          
        }
        int n2=1;
        while (n2<=100)
        {
            if (n2 % 2 ==0 ){
                System.out.println("esses sao os numero pares: "+n2);
            }
            n2++;
        }
    }
    
}
