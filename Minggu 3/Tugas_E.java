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
public class Tugas_E {
    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.println("                    Kafe DWIKI Mantap");
        System.out.println("--------------------------------------------------");
        System.out.println("              JUAL ANEKA MAKANAN DAN MINUMAN");
        System.out.println("                      SPECIAL MENU");
        System.out.println("1. Soft Drink");
        System.out.println("2. Es Boba");
        System.out.println("3. Nasi Bebek");
        System.out.println("4. Nasi Ayam");
        System.out.println("5. Kari Kucing");
        System.out.println("--------------------------------------------------");
        System.out.print("Silahkan masukan nama pembeli : ");
        String nama = b.nextLine();
        System.out.print("Silahkan masukan pilihan kamu: ");

        int u = b.nextInt();
        String pilihan = "";

        switch (u) {
            case 1:
                pilihan = "Soft Drink";
                break;
            case 2:
                pilihan = "Es Boba";
                break;
            case 3:
                pilihan = "Nasi Bebek";
                break;
            case 4:
                pilihan = "Nasi Ayam";
                break;
            case 5:
                pilihan = "Kari Kucing";
                break;
            default:
                System.out.println("pilihan anda tidak ada di menu");
                break;
        }

        System.out.println("Minuman dan makanan yang anda pilih : " + pilihan);
        System.out.println("Pesanan anda akan segera di antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung ke Kafe DWIKI Mantap");

    }
}
