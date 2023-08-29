package net.parisotto.exemplos;

/** beecrowd | 1007 | Diferença
 *  https://www.beecrowd.com.br/judge/pt/problems/view/1007
 *
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de
 * A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 *
 * Entrada: O arquivo de entrada contém 4 valores inteiros.
 * Saída: Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo,
 * com um espaço em branco antes e depois da igualdade.
 *
 * Exemplo de Entrada: 5 6 7 8
 * Exemplo de Saída: DIFERENCA = -26
 */

import java.io.IOException;
import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int dif, a, b, c, d;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        dif = a * b - c * d;

        System.out.printf("DIFERENCA = %d", dif);
    }
}
