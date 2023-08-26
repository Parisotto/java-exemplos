package net.parisotto.exemplos;

import java.io.IOException;

public class Ex1151 {
    public static void main(String[] args) throws IOException {
        try(java.util.Scanner scan = new java.util.Scanner(System.in)){
            int fibo = scan.nextInt();
            int a = 0;
            int b = 1;

            System.out.print("0 1");

            for(int i = 3; i <= fibo; i++){
                System.out.printf(" %d", a + b);
                int aux = a;
                a = b;
                b = aux + b;
            }

            System.out.println();
        }
    }
}
