package net.parisotto.exemplos;

import java.io.IOException;

public class Ex1151 {
    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int fibo = scan.nextInt();
        int a = 0;
        int b = 1;

        System.out.printf("%d %d", a, b);

        for(int i = 3; i <= fibo; i++){
            System.out.print(" " + a + b);
            int aux = a;
            a = b;
            b = aux;
        }

        System.out.println();
    }
}
