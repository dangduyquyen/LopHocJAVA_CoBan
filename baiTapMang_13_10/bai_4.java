/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapMang_13_10;

import static baiTapMang_13_10.bai_2.sc;

/**
 *
 * @author Admin
 */
public class bai_4 {
    public static void main(String[] args) {
        int[] array = null;
        array = SinhNgayNhien();
        DuyetT_P(array);
        System.out.println("");
        DuyetP_T(array);
       
        
    }

    private static int[] SinhNgayNhien() {
        System.out.print("Nhập độ lớn của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length; i++) {
            a[i] = (int) (Math.random()*100);
        }
        return a;
    }

    private static void DuyetT_P(int a[]) {
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }
    private static void DuyetP_T(int a[]) {
    for(int i = (a.length-1); i >= 0; i--){
        System.out.print(a[i] + ", ");
        }
    }
    
    
}
