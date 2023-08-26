package net.parisotto.exemplos;

import java.io.IOException;

public class Ex1080 {
    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a, maior = 0, pos = 0;

        for(int i = 1; i <= 100; i++){
            a = scan.nextInt();
            if(a > maior){
                maior = a;
                pos = i;
            }
        }

        System.out.printf("%d\n%d", maior, pos);
    }
}
