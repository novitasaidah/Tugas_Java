/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author My Comp
 */
public class contohScanner {
    public static void main(String[] args) {
        int usia = 0;
        // membuat scanner
        System.out.println("Umur Anda Berapa?");
        Scanner inputUser = new Scanner(System.in);
        usia = Integer.parseInt(inputUser.nextLine());
        // output
        System.out.println("Usia Anda Adalah" + usia);
      
    }
}
