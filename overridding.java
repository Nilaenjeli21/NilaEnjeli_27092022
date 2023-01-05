/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_27092022;

/**
 *
 * @author Nila Enjeni
 */
 import java.util.Scanner;
public class overridding {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Program Menentukan Hari ");
        System.out.println();
        
        int n;
        
        System.out.println(" Input Angka Hari (1-7): ");
        n = input.nextInt();
        
        String[] hari = {
            "Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu"
        };
        
        if ((n<1)|| (n>7)){
            System.out.println(" Pilihan Anda Tidak Tersedia ");
        }
        else {
            System.out.println(hari[n-1]);
        }
    }

}
