package Exercicios;

import java.awt.*;
import java.util.Scanner;

/*Faça um programa que apresente o menu de opções a seguir
1. Média aritmética 2. Média ponderada 3. Sair
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar amédia
ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.
 */
public class MenuOpções {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int menu;
        double nota1;
        double nota2;
        double nota3;
        double mediaAritmetica;
        double mediaPodenderada;



        System.out.println("Digite o número corresposnde a opção desejada:" +
                " 1. Média aritmética 2. Média ponderada 3. Sair ");

        menu = Integer.parseInt(scan.next());


        if (menu == 1);{

            System.out.println("Informe a primeira nota: ");
            nota1 = Double.parseDouble(scan.next());

            System.out.println("Informe a segunda nota: ");
            nota2 = Double.parseDouble(scan.next());

            mediaAritmetica = (nota1 + nota2)/ 2;
            System.out.println("A média aritmética das notas é : " + mediaAritmetica);

        }
        if (menu == 2) {

            System.out.println("Informe a primeira nota: ");
            nota1 = Double.parseDouble(scan.next());

            System.out.println("Informe a segunda nota: ");
            nota2 = Double.parseDouble(scan.next());

            System.out.println("Informe a terceira nota: ");
            nota3 = Double.parseDouble(scan.next());

            mediaPodenderada = (nota1 * 0.1 + nota2 * 0.2 + nota3 * 0.3) / 2;
            System.out.println("A média Ponderada das notas é : " + mediaPodenderada);

        }
        if (menu == 3) {
            System.out.println("Saindo...");
        }
    }
}