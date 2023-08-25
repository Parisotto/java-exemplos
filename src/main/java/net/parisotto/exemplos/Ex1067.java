/* beecrowd | 1067 | Números Ímpares
 * https://www.beecrowd.com.br/judge/pt/problems/view/1067
 * 
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 */

package net.parisotto.exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            int valor = scan.nextInt();

            for(int i = 1; i <= valor ; i+=2){
                System.out.println(i);
            }
        }
    }
}
