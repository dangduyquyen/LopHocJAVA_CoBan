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
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\t\t\tTÌM SỐ LỚN NHẤT TRONG BA SỐ? ");
        System.out.print("Nhập số thứ nhất: ");
        int so1 = sc.nextInt();
        System.out.print("\nNhập số Thứ hai: ");
        int so2 = sc.nextInt();
        System.out.print("\nNhập số thứ ba: ");
        int so3 = sc.nextInt();
        int max;
        max = (so1 > so2) ? so1 : so2;
        max = (max > so3) ? max : so3;
        System.out.println(max);
    }
}
