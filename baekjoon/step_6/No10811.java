import java.io.*;
import java.util.*;

public class No10811 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[] arr = new int[100];
      int N = sc.nextInt();
      int M = sc.nextInt();
      int temp;
      for (int i = 0; i < N; i++) {
        arr[i] = i+1;
      }
      for(int k = 0; k<M; k++){
        
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        for(; i<=j; i++){
          temp = arr[i-1];
          arr[i-1] = arr[j-1];
          arr[j-1] = temp;
          j--;
        }
        
      }
      
      for(int i = 0; i < N; i++){
        System.out.print(arr[i]+" ");
      }

    }
}