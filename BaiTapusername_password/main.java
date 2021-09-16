/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapusername_password;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        final String USERNAME001 = "HuyHoang";  
        final String PASSWORD001 = "2021";
        Scanner sc = new Scanner(System.in);
        String userName001;
        String passWord001;
        // Nhập tài khoản
        System.out.println("\n\n\n\t\t\t Nhập username and password: ");
        System.out.print("\n\tNhập Username: ");
        userName001 = sc.nextLine();
        System.out.print("\n\tNhập Password: ");
        passWord001 = sc.nextLine();
//        System.out.println(passWord001 + userName001);
        if((userName001.equals(USERNAME001)) && (passWord001.equals(PASSWORD001))){
            System.out.println("\n\t\tNHẬP ĐÚNG");
        }else{
            System.out.println("\n\t\tNHẬP SAI");
        }
    }
}
