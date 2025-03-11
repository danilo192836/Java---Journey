package aplication;

import java.util.Scanner;

import entities.Triangulo_3;

public class aula3_poo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        Triangulo_3 x, y;
        x = new Triangulo_3();
        y = new Triangulo_3();

        System.out.println("Digite as medidas dos lados dos Triangulo x: ");
        x.a = inp.nextDouble();
        x.b = inp.nextDouble();
        x.c = inp.nextDouble();

        System.out.println("Digite as medidas dos lados dos Triangulo y: ");
        y.a = inp.nextDouble();
        y.b = inp.nextDouble();
        y.c = inp.nextDouble();

        inp.close();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A área do triangulo X é: %.4f%n", areaX);
        System.out.printf("A área do triangulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O área do triangulo X é maior que a do triandulo Y");
        } else {
            System.out.println("O área do triangulo Y é maior que a do triandulo X");
        }
    }
}

