/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuoi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_2 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        System.out.println();
        
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
          // nếu phần tử trong mảng là một chữ cái
          if(Character.isLetter(charArray[i])) {
            // kiểm tra khoảng trắng có trước chữ cái
            if(foundSpace) {
              //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
              charArray[i] = Character.toUpperCase(charArray[i]);
              foundSpace = false;
            }
          }
          else {
            foundSpace = true;
          }
        }
        // chuyển đổi mảng char thành string
        str = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: " + str);

        
    }
    
}
