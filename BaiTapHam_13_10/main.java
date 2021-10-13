/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapHam_13_10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */    
public class main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//      xuatTB();
//      Nhap_Xuat();
//      Cau_3();
//        System.out.print("nhập a: ");
//        int a = sc.nextInt();
//        System.out.print("nhập b: ");
//        int b = sc.nextInt();
//      GiaiPTB1(a, b);
//      GiaiPTB2();
//        LuaChonGiaiPT();
        LuaChonGiaiPT_01();
    }  

    private static void xuatTB() {
        System.out.println("Lập trình Java 2021");
    }

    private static void Nhap_Xuat() {
    String str;
    System.out.print("Nhập vào một chuỗi ký tự: ");
    str = sc.nextLine();
    System.out.print(str);
    }

    private static void Cau_3() {
        int n;
        
        do{
            System.out.print("Nhập vào một số: ");
            n = sc.nextInt();
        }while (n < 0);
        for(int i = 1; i <= n ; i++){
            Nhap_Xuat();
            System.out.println();
        }

    }

    private static void GiaiPTB1(float a, float b) {
        double x = (-b)/a;
        System.out.print(x);
    }

    private static void GiaiPTB2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }

    private static void LuaChonGiaiPT() {
        System.out.print("\n1: Giải phương trình bật nhất:"
                + "\n2: Giải phương trình bật hai:"
                + "\nNhập lựa chọn: ");
        int chon = sc.nextInt();
        switch(chon){
            case 1:{
                System.out.print("nhập a: ");
                float a = sc.nextFloat();
                System.out.print("nhập b: ");
                float b = sc.nextFloat();
                GiaiPTB1(a, b);
            break;
            } 
            case 2: {
                System.out.print("nhập a: ");
                float a = sc.nextFloat();
                System.out.print("nhập b: ");
                float b = sc.nextFloat();
                System.out.print("nhập b: ");
                float c = sc.nextFloat();
                GiaiPTB2(a, b, c);
            }
        }  
    }

    private static void LuaChonGiaiPT_01() {
        boolean flag = true;
        do{
            System.out.print("\n1: Giải phương trình bật nhất:"
                    + "\n2: Giải phương trình bật hai:"
                    + "\nChọn số khác để thoát: "
                    + "\nNhập lựa chọn: ");
            int chon = sc.nextInt();
            switch(chon){
                case 1:{
                    System.out.print("nhập a: ");
                    float a = sc.nextFloat();
                    System.out.print("nhập b: ");
                    float b = sc.nextFloat();
                    GiaiPTB1(a, b);
                break;
                } 
                case 2: {
                    System.out.print("nhập a: ");
                    float a = sc.nextFloat();
                    System.out.print("nhập b: ");
                    float b = sc.nextFloat();
                    System.out.print("nhập b: ");
                    float c = sc.nextFloat();
                    GiaiPTB2(a, b, c);
                }
                default:
                    System.out.println("Bye!!");
                    flag = false;
                    break;
            }
  
        }while(flag);
    }
}
