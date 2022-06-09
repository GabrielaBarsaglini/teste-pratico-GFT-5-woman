package Exercicios;

import java.util.Scanner;

/*
Fórmula de Bhaskara
Considere a fórmula de bhaskara (a seguir) para encontrar os valores
de x numa equação de 2o grau onde ax2+bx+c=0, faça um programa
que receba um valor de a, um valor de b e um valor de c e imprima os
valores x’ e x”.
 */
public class Bhaskara {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double a, b, c;
        double delta;
        double x1, x2;

        System.out.println("Digite o valor de a: ");

        a = Double.parseDouble(scan.next());

        System.out.println("Digite o valor de b: ");

        b = Double.parseDouble(scan.next());

        System.out.println("Digite o valor de c: ");

        c = Double.parseDouble(scan.next());

        delta = Math. pow (b, 2) - 4* a *c;
        System.out.println(delta);


            x1 = -b + Math. sqrt(delta) / 2*a;
            System.out.println(x1);

            x2 = -b - Math. sqrt(delta) / 2*a;
            System.out.println(x2);

        }


    }