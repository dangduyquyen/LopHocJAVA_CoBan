/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTapSlide24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random so1 = new Random();
        Random so2 = new Random();
        
        int number1 = so1.nextInt(100);
        int number2 = so2.nextInt(100);
        
        System.out.println(number1 + " - " + number2 + " bằng bao nhiêu: ");
        
        System.out.print("Nhập câu trả lời của bạn: ");
        int so = sc.nextInt();
        if(so == (number1 - number2)){
            System.out.println("Câu trả lời của bạn là đúng");
        }
        else{
            System.out.println("Câu trả lời của bạn là sai");
        }
        
    }
    
}
