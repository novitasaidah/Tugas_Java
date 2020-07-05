/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import javax.swing.JOptionPane;

/**
 *
 * @author My Comp
 */
public class percabanganifelse {
    public static void main(String[] args) {
String tanggal2;
String Bulan7;
int tanggal;
int Bulan;
tanggal2 = JOptionPane.showInputDialog("inputkan Bulan Lahir Anda : ");
tanggal = Integer.parseInt(tanggal2);
Bulan7 = JOptionPane.showInputDialog("Inputkan Hari Lahir Anda :");
Bulan = Integer.parseInt(Bulan7);
if (tanggal >=1 && tanggal <=31 && Bulan ==1) {
JOptionPane.showMessageDialog(null,"Bulan Anda Januari"); }
else if (tanggal >=1 && tanggal <=29 && Bulan == 2) {
JOptionPane.showMessageDialog(null, "Bulan Anda adalah Februari"); }
else if (tanggal <=1 && tanggal <=31 && Bulan == 3) {
JOptionPane.showMessageDialog(null,"Bulan anda Adalah Maret"); }
else if (tanggal >=1 && tanggal <=30 && Bulan == 4) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah April"); }
else if (tanggal >=1 && tanggal <=31 && Bulan == 5) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah Mei"); }
else if (tanggal >=1 && tanggal <=30 && Bulan == 6) {
JOptionPane.showMessageDialog(null,"Bulan Anda Adalah Juni"); }
else if (tanggal >=1 && tanggal <=31 && Bulan == 7) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah Juli"); }
else if (tanggal >=1 && tanggal <=31 && Bulan == 8) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah Agustus"); }
else if (tanggal >=1 && tanggal <=30 && Bulan == 9) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah September"); }
else if (tanggal >=1 && tanggal <=31 && Bulan == 10) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah Oktober"); }
else if (tanggal >=1 && tanggal <=30 && Bulan == 11) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah November"); }
else if (tanggal >=1 && tanggal <=31 && Bulan == 12) {
JOptionPane.showMessageDialog(null, "Bulan Anda Adalah Desember"); }

    }
}

    

