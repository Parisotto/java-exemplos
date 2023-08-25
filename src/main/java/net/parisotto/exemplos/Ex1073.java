package net.parisotto.exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Ex1073 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 2; i <= n; i+=2){
            System.out.printf("%d^2 = %d\n", i, i * i);
        }
    }
}
