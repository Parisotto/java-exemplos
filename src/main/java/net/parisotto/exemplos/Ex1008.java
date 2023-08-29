package net.parisotto.exemplos;

import java.io.IOException;
import java.util.Scanner;

/**
 URI Online Judge | 1008
 Salário

 Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e
 o salário do funcionário, com duas casas decimais.

 Entrada: O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
 representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por
 hora trabalhada, respectivamente.
 Saída: Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço
 em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco
 após o $.

 Exemplo de Entrada:	25 100 5,50
 Exemplo de Saída:
 NUMBER = 25
 SALARY = U$ 550.00
 */

public class Ex1008 {
    public static void main(String[] args) throws IOException {
        int horasTrab, numeroFunc;
        float valorHoras, salario;

        Scanner scan = new Scanner(System.in);
        numeroFunc = scan.nextInt();
        horasTrab = scan.nextInt();
        valorHoras = scan.nextFloat();

        salario = horasTrab * valorHoras;

        System.out.println("NUMBER = " + numeroFunc);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}