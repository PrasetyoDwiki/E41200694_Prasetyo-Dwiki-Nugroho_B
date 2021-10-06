/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwiki
 */
public class latihan_array_2D {
    public static void main(String[] args) {
        int[][] number = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},};
        System.out.print("[ ");
        for (int[] is : number) {
            for (int i : is) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");
    }
}