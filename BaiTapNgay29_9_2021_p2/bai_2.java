
package BaiTapNgay29_9_2021_p2;

import java.util.Scanner;
class bai_2
{
    public static void main(String[ ] arg)
    {
        boolean isVowel=false;;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra : ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if(isVowel == true) {
            System.out.println(ch+" Là nguyên âm");
        }
        else {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" Là phụ âm");
            else
                System.out.println("Không nằm trong bảng chữ cái!");
        }
    }
}