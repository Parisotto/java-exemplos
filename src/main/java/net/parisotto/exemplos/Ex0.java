package net.parisotto.exemplos;
public class Ex0 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (i * matriz[i].length + j+1) * 10;
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("%4.0f |", matriz[i][j]);
            }
            System.out.println();
        }
    }     
}

