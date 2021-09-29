
package BaiTapNgay29_9_2021_p2;
import java.util.Scanner;

public class bai_3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một năm: ");
        long n = sc.nextLong();
	if(n % 100 == 0 && n % 400 != 0) {
		System.out.print("none");
	}else if(n % 4 ==0) {
		System.out.print("leap year");
	}
	else {
		System.out.print("none");
	}
            System.out.println();
    }
}

