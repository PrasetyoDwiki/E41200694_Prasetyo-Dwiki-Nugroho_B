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
public class Tugas_D {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("--------------------------vvvvvvvvvvvvvvvvvv----------------------------");
        System.out.println("                         DWIKI MOGA SUKSES (DMS)");
        System.out.println("                        Promo Belanja Berhadiah");
        System.out.println("                      Khusus Pembelian 5 Pertama");
        System.out.println("                   Dengan Harga Minimum Rp 10.000,00");
        System.out.println("                    MONGGO DI BORONG PUMPUNG PROMO");
        System.out.println("---------------------vvvvvvvvvvvvvvvvvvvvvvvvvvv------------------------");
        System.out.print("Masukan nama Pembeli : ");
        String nama = a.nextLine();
        
        int[] barang = new int[5];
        int total = 0;
        for (int j = 0; j < barang.length; j++) {
            System.out.print("Masukan harga barang ke-" + (j) + " : ");
            barang[j] = a.nextInt();
            total = total + barang[j];
        }

        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp. " + total);

        // cek promo
        boolean promo = false;
        for (int i = 0; i < barang.length; i++) {
            promo = barang[i] >= 10000;
        }

        if (promo == true) {
            System.out.println("Selamat...!!!");
            System.out.println("Anda mendapat hadiah 1 buah piring cantik");
        } else {
            System.out.println("Anda tidak mendapat promo");
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                             Terima Kasih");
        System.out.println("                 nda sudah berbelanja di DWIKI MOGA SUKSES");

    }
}
