import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++)
        {   int count =0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int j=0; j<n; j++)
            {
                a[j] = sc.nextInt();
            }
            for(int l=0; l<n; l++)
            {
                if(a[l] <= 0 )
                {
                    count++;
                }
            }
         if(count >= k)
         {
             System.out.println("NO");
         }else
         {
             System.out.println("YES");
         }
        }
    }
}
