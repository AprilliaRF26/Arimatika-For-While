package Perulangan;

import java.util.Scanner;

public class ArimatikaWhile {
    public static void main(String[] args) {
        int a, b, c, hasil, i=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan suku pertama:");
        b = s.nextInt();
        System.out.println("Masukkan jumlah suku:");
        a = s.nextInt();
        System.out.println("Masukkan beda:");
        c = s.nextInt();

        while (i<=a){
            hasil = b+(i-1)*c;
            System.out.println("Suku ke "+i+" bernilai: "+hasil);
            i++;
        }
    }
    
}
