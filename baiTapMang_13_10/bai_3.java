package baiTapMang_13_10;
import java.util.Scanner;  
import java.util.Random;
public class bai_3 {
   public static void randomint(int[] a) {
      Random rd = new Random(); 
      a = new int[10];
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter any number : ");
      int n = scanner.nextInt();
      for (int i = 0; i < n; i++) {
         a[i] = rd.nextInt(100); // storing random integers in an array
         System.out.println(a[i]); // printing each array element
      }
   }
      public static void randomfloat(float[] b) {
      Random rd = new Random(); 
      b = new float[10];
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter any number : ");
      int n = scanner.nextInt();
      for (int i = 0; i < n; i++) {
         b[i] = rd.nextInt(100); // storing random integers in an array
         System.out.println(b[i]); // printing each array element
      }
   }
      public static float average(int[] a, float[] b) {
        float average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            average = a[i]*b[i];
        }
        return average/n;
    }
    public static void main(String[] args){
          int[] a= new int[10];
          float[] b= new float[10];
          randomint(a);
          randomfloat(b);
          average(a,b);
    }
}