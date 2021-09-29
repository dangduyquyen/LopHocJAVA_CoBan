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
public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        double inch = sc.nextDouble();
        double m;
        m = (inch / 39.370);
        System.out.printf(inch + " inch sang mét là: ");
        System.out.printf("%.1f", m );
        

    }
}
