/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pheptoan;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        /*  cộng: +
            trừ:  -
            nhân: *
            chia: /
            chia lấy dư: %
        */
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        System.err.println("Tổng là:" + (a+b)
                + "\nHiệu là:" + (a-b)
                + "\nTích là:" + (a*b)
                + "\nThương là:" + (a/b)
                + "\nPhần Dư là:" + (a%b) ); 
        
        
        
        
        
    }
}
