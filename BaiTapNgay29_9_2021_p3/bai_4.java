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
public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        int phut = sc.nextInt();
        int gio = phut / 60;
        int  ngay = gio / 24;
        int nam = ngay / 365;
        int ngaycl = ngay - (nam * 365);
        System.out.println(phut + " minutes is approximately " + nam + " years and " + ngaycl + "days" );
    }
}
