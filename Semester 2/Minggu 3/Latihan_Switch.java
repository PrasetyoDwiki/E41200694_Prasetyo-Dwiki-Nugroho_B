
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwiki
 */
public class Latihan_Switch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Masukan NIM : ");
        String nim = s.nextLine();

        if (null == nim) {
            System.out.println("NIM yang anda masukan tidak ada");
        }

        switch (nim) {
            case "E41200694":
                System.out.println("NIM\t: E41200694");
                System.out.println("NAMA\t: PRASETYO DWIKI NUGROHO");
                break;
            case "E41200695":
                System.out.println("NIM\t: E41200695");
                System.out.println("NAMA\t: MUHAMMAD SHOLEH");
                break;
            default:
                System.out.println("nim yang anda masukan tidak ada");
                break;
        }
    }
}
