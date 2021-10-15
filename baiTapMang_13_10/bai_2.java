/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapMang_13_10;
import static baiTapMang_13_10.bai_1.sc;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Xin_Ngau_Nhien();

        Trung_Binh_Cong_Xin_NN();
    }

    private static void Xin_Ngau_Nhien() {
        System.out.print("Nhập độ lớn của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length; i++) {
            a[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i< a.length; i++){
            System.out.print(a[i]+ ", ");
        }
    }

    private static void Trung_Binh_Cong_Xin_NN() {
        System.out.print("Nhập độ lớn của mảng: ");
        int n = sc.nextInt();
        int dem = 0;
        double tb = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i< a.length; i++){
            tb += a[i];
            dem++;
        }
        System.out.println("Trung bình cộng của mảng được xin ngẫu nhiên là: " + tb/dem);
    }
        
    
    
}
