/* beecrowd | 1070 | Seis Números Ímpares
 * https://www.beecrowd.com.br/judge/pt/problems/view/1070
 * 
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos 
a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
 */

package net.parisotto.exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Ex1070 {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            int valor = scan.nextInt();
            
            for(int i = 1; i <= 6 ; i++){
                if(valor % 2 > 0) {
                    System.out.println(valor);
                } else {
                    System.out.println(++valor);
                }
                valor += 2;
            }
        }
    }
}
