/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuoi;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tổng số ký tự có trong mảng ký tự: ");
        int n;
        n = sc.nextInt();
        char[] a = new char[n];
        for(int i = 0 ; i < a.length; i++){
            a[i] = sc.next().charAt(0);
        }
        String str = "";

        for (Character c : a)
            str += c.toString();

        System.out.println(str);
    }
    
}
