/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KhaiBao_Nhap_Xuat;
// improt thư viện Scanner //
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // tạo đối tượng sc thuộc lớp Scanner.
        Scanner sc = new Scanner(System.in);
        // Khai báo biến tên
        String name;
        // Nhập tên
        name = sc.nextLine();
        // Xuất tên
        System.out.println("My name is "+ name);
        
    }
}
