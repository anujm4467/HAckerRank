import java.io.*;
import java.util.*;

public class FindDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++)
        {
           int n = sc.nextInt();
            int count =0;    // count to count the remender
            int r = n;
            while(r>0){
                if((r%10 != 0) && n%(r%10) == 0){   // two case are checking suppose r=12 then 12%10 is not equal to zero then we divide it by 10 
                    count ++;  
                }
                r =r/10;
            }
         System.out.println(count);   
        }
    }
}
