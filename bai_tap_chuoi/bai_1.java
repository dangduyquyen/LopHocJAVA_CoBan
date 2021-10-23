/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuoi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        System.out.println();
        System.out.print("Chuỗi sau khi được xóa khoản trắng: ");
        str = str.replaceAll(" ", "");
        System.out.println(str);
        
        
    }
    
}
