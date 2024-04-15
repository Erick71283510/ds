/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4while;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Ex4while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos alunos têm na sala?");
        int quantidadeAlunos = scan.nextInt();

        int contador = 1;
        double somaDasNotas = 0;

        while (contador <= quantidadeAlunos) {
            System.out.println("Entre com a nota do aluno " + contador + ":");
            double nota = scan.nextDouble();
            somaDasNotas += nota; // Acumula as notas para calcular a média depois
            contador++;
        }

        double media = somaDasNotas / quantidadeAlunos;
        System.out.println("A média da turma é: " + media);

        scan.close(); // f  echa o scanner
    }
    
}
