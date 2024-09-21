package Perulangan;

import java.util.Scanner;

public class ArimatikaFor {
    public static void main(String[] args) {
        int a, b, c, hasil;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan suku pertama:");
        b = s.nextInt();
        System.out.println("Masukkan lah jumlah suku:");
        a = s.nextInt();
        System.out.println("Masukkan beda:");
        c = s.nextInt();

        for (int i = 1; i<=a; i++){
            hasil = b+(i-1)*c;
            System.out.println("Suku ke "+i+" bernilai: "+hasil);
        }
    }
}
