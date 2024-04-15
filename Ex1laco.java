/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1laco;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Ex1laco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double primeiroValor = scan.nextDouble();

        double segundoValor;
        do {
            System.out.println("Digite o segundo valor (não pode ser zero):");
            segundoValor = scan.nextDouble();
        } while (segundoValor == 0); // Se o segundo valor for zero, solicita um novo valor

        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);

        scan.close(); // Fecha o scanner    }
    
}
}