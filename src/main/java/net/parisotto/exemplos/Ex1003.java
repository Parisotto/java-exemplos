package net.parisotto.exemplos;

/** beecrowd | 1003 | Soma Simples
 * https://www.beecrowd.com.br/judge/pt/problems/view/1003
 *
 * Leia dois valores inteiros, no caso para variáveis A e B.
 * A seguir, calcule a soma entre elas e atribua à variável SOMA.
 * A seguir escrever o valor desta variável.
 *
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros.
 *
 * Saída
 * Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco
 * antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
 * Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
 * caso contrário, você receberá "Presentation Error".
 */

import java.io.IOException;
import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int a, b, soma;

        a = scan.nextInt();
        b = scan.nextInt();

        soma = a + b;

        System.out.printf("SOMA = %d\n", soma);
    }
}
