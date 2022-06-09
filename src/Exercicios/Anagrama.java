package Exercicios;

import java.util.Objects;
import java.util.Scanner;

/*
        Anagrama é um substantivo que significa uma palavra ou frase que é construída através da
        alteração das letras de uma outra palavra ou frase.
        Para criar um anagrama, podem ser trocadas duas ou mais letras. Por exemplo: a palavra
        pedra pode ser transformada em perda, se trocarmos o "d" pelo "r". Com a mesma palavra
        "pedra", é possível formar a palavra "padre", trocando a letra "a" com a letra "e". Perda e
        padre são anagramas de pedra.
        Outros exemplos de anagramas:
        Alegria: alergia, regalia, galeria;
        Cantiga: catinga;
        Carro: corar;
        Muro: rumo.
        Crie um programa que receba 2 palavras e identifique se elas são um anagrama
*/
public class Anagrama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra1;
        String palavra2;
        String anagrama;

        System.out.println("Digite a primeira palavra: ");
        palavra1 = scan.next();
        palavra1.length();
        System.out.println(palavra1.length());

        System.out.println("Digite a segunda palavra: ");
        palavra2 = scan.next();
        palavra2.length();
        System.out.println(palavra2.length());

        if (Objects.equals(palavra1.length(), palavra2.length())) {
            System.out.println("Tem o mesmo tamanho! ");

        }
        else {
            System.out.println("As palavras não são um anagrama!");
        }
    }
}
