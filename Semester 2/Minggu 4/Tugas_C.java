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
public class Tugas_C {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int masukkan ,nilai,bil1,bil2,bil3,bil4,max,min;
        System.out.print("Masukkan banyaknya data niai = ");
        nilai=input.nextInt();
        System.out.print("Masukkan data nilai ke-1 = ");
        bil1=input.nextInt();
        System.out.print("Masukkan data nilai ke-2 = ");
        bil2=input.nextInt();
        System.out.print("Masukkan data nilai ke-3 = ");
        bil3=input.nextInt();
        System.out.print("Masukkan data nilai ke-4 = ");
        bil4=input.nextInt();
        
        if(bil1>bil2 && bil1>bil3 && bil1>bil4){
        max = bil1;
        }else{
        if(bil2>bil3 && bil2>bil4){
        max=bil2;
        }else{
        if(bil3>bil4) {
        max=bil3;
        }else{
        max=bil4;
            }
            } 
        }
        System.out.println("Nilai maximum = " +max);
    }
}


   
