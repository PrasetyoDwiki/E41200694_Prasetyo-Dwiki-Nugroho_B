/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author dwiki
 */
public class Tugas_A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int pilihan, awal, akhir;
    
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Nilai Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir=input.nextInt();
        System.out.println("--------------------------- ");
        System.out.println("Deret Bilangan Genap");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2==0)
                        System.out.print(i+" ");
                    }
        }
}
