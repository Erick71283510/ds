/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8while;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Ex8while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado (entre 1 e 20):");
        int tamanhoLado = scan.nextInt();

        // Verifica se o tamanho do lado está dentro do intervalo válido
        if (tamanhoLado >= 1 && tamanhoLado <= 20) {
            int linha = 1;
            // Loop para imprimir cada linha do quadrado
            while (linha <= tamanhoLado) {
                int coluna = 1;
                // Loop para imprimir asteriscos e espaços em branco em cada linha
                while (coluna <= tamanhoLado) {
                    if (coluna == 1 || coluna == tamanhoLado || linha == 1 || linha == tamanhoLado) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    coluna++;
                }
                System.out.println(); // Move para a próxima linha após imprimir os caracteres
                linha++;
            }
        } else {
            System.out.println("Tamanho do lado inválido. Por favor, digite um número entre 1 e 20.");
        }

        scan.close(); // Fecha o scanner
    }
    
}
