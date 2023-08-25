/* beecrowd | 1071 | Soma de Impares Consecutivos I
 * https://www.beecrowd.com.br/judge/pt/problems/view/1071

Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão 
entre os valores fornecidos na entrada que deverá caber em um inteiro.

 */

package net.parisotto.exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Ex1071 {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int aux;
            int impares = 0;
            
            if(a > b){
                aux = a;
                a = b;
                b = aux;
            }

            for(int i = ++a; i < b; i++){
                if(i % 2 != 0){
                    impares += i;
                }
            }

            System.out.println(impares);
        }
    }
}
