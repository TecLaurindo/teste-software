/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rr.senac;
import java.util.Scanner;
/**
 *
 * @author devlaurindex
 */
public class Calculator {

    public static void main(String[] args) { //classe do tipo argument0
        Scanner leia = new Scanner(System.in); //Comando para criar um scanner e ler as Teclas do Teclado
        System.out.println("Digite os numeros a serem calculados:");
        System.out.print("N°: ");
        double num1 = leia.nextDouble();
        System.out.println("N°: ");
        double num2 = leia.nextDouble();

        double soma;
        
        soma = num1 + num2;

        System.out.println("O resultado do calculo é: "+ soma);
    }
}
