/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTapSlide25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn: ");
        double weight = sc.nextDouble();
        System.out.println("Nhập chiều cao của bạn của bạn: ");
        double height = sc.nextDouble();
        double MBI = weight / (height*height);
        
        if(MBI < 18.5){
            System.out.println("Underweight");
        }else if(MBI >= 18.5 && MBI <25.0){
            System.out.println("Notmal");
        }else if(MBI >= 25.0 && MBI < 30.0){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
        
        
        
        
    }
    
    
}
