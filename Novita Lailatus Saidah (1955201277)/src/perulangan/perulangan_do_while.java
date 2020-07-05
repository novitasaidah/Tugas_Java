/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author My Comp
 */
public class perulangan_do_while {
    public static void main(String[] args) {
        int i=0;
        System.out.println("main hp");
        while (i < 2){
            System.out.println("mandi" + ++i);
            
        }
        System.out.println("makan");
        i=0;
        do {
            System.out.println("tidur" + ++i);
        }
        while (i<2);
    }
}
