/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author My Comp
 */
public class contohBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nama = "";
        String status = "";
        // object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        // object bufferedReaser
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variabel nama dengan bufferedReader
        System.out.println("Siapa Nama Anda?");
        nama = br.readLine();
        
        System.out.println("Jomblo Opo Ora, Kowe?");
        status = br.readLine();
        // menampilkan nama
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Anda Ternyata " + status);
        
    }
    
}
