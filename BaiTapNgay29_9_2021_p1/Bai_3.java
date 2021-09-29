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
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        double so = sc.nextDouble();
        if(so == 0){
            System.out.println("zero");
        }
        if(so > 0 && so < 1){
            System.out.println("small positive");
        }
        if(so > 1 && so < 1000000){
             System.out.println("positive");
        }
        if(so > 1000000){
            System.out.println("large positive");
        }
        if(so <0 && so > -1){
            System.out.println("small negative");
        }
        if(so <-1 && so > -1000000){
            System.out.println("negative");
        }
        if(so < -1000000){
            System.out.println("large negative");
        }
        
    }
}
