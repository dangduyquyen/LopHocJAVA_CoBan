/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay29_9_2021_p1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên khác 0: ");
        long so = sc.nextLong();
        String temp;
        temp = (so > 0) ? "Number is positive" : "Number is negative";
        System.out.println(temp);      
    }
            
}
