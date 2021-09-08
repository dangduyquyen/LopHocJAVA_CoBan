/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhChuViHinhTron;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Bán Kính: ");
        double radius = sc.nextDouble();
        System.out.println("chu vi hình tròn có " + radius + " là: " + (2*radius*Math.PI));
 
        
   }
 
}
