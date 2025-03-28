package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {
    public double base, altura, lado2, lado3, area, perimetro, hipotenusa;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/*********/");
        System.out.println("/* Cadastrar triangulo  */");
        System.out.println("/*********/");
        System.out.print("Informe a base: ");
        base = scanner.nextDouble();
        System.out.println("/*********/");
        System.out.println("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();

        return true;
    }

    public void calcularArea() {
        System.out.println("/* Calculando Area");
        area = (base * altura) / 2;
        System.out.println("A area é: " + area);

    }

    public void calcularPerimetro() {
        System.out.println("/*  Calculando Perimetro  */");
        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);

    }


    /* Definir tipo de Triangulo/

    /** Equilatero - Escaleno - Isosceles */

    public void definirTipo() {
        System.out.println("/* Definindo Tipo Triângulo*/");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triangulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

        } else {
            System.out.println("ESse triangulo é um Isosceles...");
        }

    }

    //inicio do Desafio, implementando um método que verificar se é um triangulo retangulo

    public boolean trianguloRetangulo(){
        System.out.println("Verificando se o triangulo é um retangulo");

        //A hipotenusa é o maior lado de um triangulo retângulo, utilizando "Math.Max" para verificar qual o maior lado
        double hipotenusa = Math.max(Math.max (base, lado2), lado3);

        double lado1, lado2Menor;

        if (hipotenusa == base) {
            lado1 = lado2;
            lado2Menor = lado3;
        } else if (hipotenusa == lado2) {
            lado1 = base;
            lado2Menor = lado3;
        } else {
            lado1 = base;
            lado2Menor = lado2;
        }


        return Math.abs(Math.pow(hipotenusa, 2) - (Math.pow(lado1, 2) + Math.pow(lado2Menor, 2))) < 0.0001;
    }
    public class Triangulo345 {
        public static boolean éumtriangulo345(int a, int b, int c) {
            // ordena os valores para garantir que 'c' seja o maior lado (hipotenusa)
            int[] lados = {a, b, c};
            java.util.Arrays.sort(lados);

            // verifica se formam um triângulo 3-4-5
            return (lados[0] == 3 && lados[1] == 4 && lados[2] == 5);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro lado: ");
            int lado1 = scanner.nextInt();

            System.out.print("Digite o segundo lado: ");
            int lado2 = scanner.nextInt();

            System.out.print("Digite o terceiro lado: ");
            int lado3 = scanner.nextInt();

            if (éumtriangulo345(lado1, lado2, lado3)) {
                System.out.println("Os valores informados formam um triângulo 3-4-5!");
            } else {
                System.out.println("Os valores informados NÃO formam um triângulo 3-4-5.");
            }

            scanner.close();
        }
    }


}