package net.parisotto.exemplos;

public class Ex1072 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int dentro = 0;
        int fora = 0;
        int valor;

        for(int i = n; i > 0; i--){
            valor = scan.nextInt();
            if(valor >= 10 && valor <= 20){
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}
