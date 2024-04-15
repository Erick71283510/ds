/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5laco;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Ex5laco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        double nota1, nota2;

       
        do {
            System.out.println("Digite a nota da 1ª avaliação (de 0 a 10):");
            nota1 = scan.nextDouble();
        } while (nota1 < 0 || nota1 > 10); 
        do {
            System.out.println("Digite a nota da 2ª avaliação (de 0 a 10):");
            nota2 = scan.nextDouble();
        } while (nota2 < 0 || nota2 > 10); 
        double media = (nota1 + nota2) / 2;

       
        System.out.println("Média do aluno: " + media);

        scan.close(); 
    
}
}
