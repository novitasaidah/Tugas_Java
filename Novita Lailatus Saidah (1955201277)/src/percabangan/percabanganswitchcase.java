/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author My Comp
 */
public class percabanganswitchcase {
     public static void main(String[] args) {
        char grade = 'F';
              switch(grade) {
         case 'A' :
            System.out.println("semangat terus!");
            break;
         case 'B' :
            System.out.println("di tingkatkan lagi!");
            break;
         case 'C' :
            System.out.println("yuk lebih semangatlagi belajarnya");
            break;
         case 'D' :
            System.out.println("tidak boleh menyerah");
         case 'F' :
            System.out.println("pasti bisa"
                    + "");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);

    }
  
         
}


