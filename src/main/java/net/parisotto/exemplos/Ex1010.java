package net.parisotto.exemplos;

import java.io.IOException;
import java.util.Scanner;

/**
 URI Online Judge | 1010
 Cálculo Simples

 Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de 
 cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
 Após, calcule e mostre o valor a ser pago.

 Entrada: O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, 
 respectivamente dois inteiros e um valor com 2 casas decimais.

 Saída: A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de 
 deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado 
 com 2 casas após o ponto.

 Exemplos de Entrada:
 12 1 5.30
 16 2 5.10

 Exemplos de Saída: VALOR A PAGAR: R$ 15.50
 */

public class Ex1010 {
    public static void main(String[] args) throws IOException {
        int cd1, cd2, np1, np2;
        double vu1, vu2, total;

        Scanner scan = new Scanner(System.in);
        cd1 = scan.nextInt();
        np1 = scan.nextInt();
        vu1 = scan.nextDouble();

        cd2 = scan.nextInt();
        np2 = scan.nextInt();
        vu2 = scan.nextDouble();

        total = (np1 * vu1) + (np2 * vu2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}