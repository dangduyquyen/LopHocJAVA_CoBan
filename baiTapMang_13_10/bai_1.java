/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapMang_13_10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Nhap_Xuat_Mang();
        Trung_Binh_Cong();
    }

    private static void Nhap_Xuat_Mang() {
        System.out.print("Nhập độ lớn của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i< a.length; i++){
            System.out.print(a[i] + ", ");
        }
        
    }

    private static void Trung_Binh_Cong() {
        System.out.print("Nhập độ lớn của mảng: ");
        int n = sc.nextInt();
        int dem = 0;
        double tb = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i< a.length; i++){
            tb += a[i];
            dem++;
        }
        System.out.println("Trung bình cộng của mảng là: " + tb/dem);
        
        
    }
}
