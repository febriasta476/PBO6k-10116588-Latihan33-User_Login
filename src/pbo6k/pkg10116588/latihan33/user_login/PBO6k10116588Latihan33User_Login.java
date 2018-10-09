/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan33.user_login;

import java.util.Scanner;

/**
 *
 * @author Indra F
 * Nama                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan User Login
 */
public class PBO6k10116588Latihan33User_Login {
 private static String usName;
    private static String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Username\t: ");
        usName = scanner.nextLine();

        System.out.print("Masukan Password\t: ");
        passWord = scanner.nextLine();

        User user = new User();
        user.pengecekanLogin(usName, passWord);
    }

}
    
    
    

