/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay29_9_2021_p3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_1 {
        public static void main(String[] args) {
        double F; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào độ fahrenheit cần đổi: ");
        F = scanner.nextDouble();
        
        double C ;
        C = (F -32 )/1.8;
        System.out.println(F + " độ F = " + C + " độ C");
   }
}
