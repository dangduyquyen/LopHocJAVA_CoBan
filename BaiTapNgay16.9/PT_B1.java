/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay16_9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PT_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\t\t\tGiải phương trình bật nhất 1 ẩn: ");
        System.out.print("\tNhập số a: ");
        double a = sc.nextDouble();
        System.out.print("\tNhập số b: ");
        double b = sc.nextDouble();
        
        if((a != 0)){
                System.out.println("\n\tPhương trình "+ a + "x + " + b + " = 0 có nghiệm là: " + (-b/a) );
        }else if ((a==0) && (b!=0)){
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Phương trình có vô số nghiệm");
        }
    
    }
    
}
