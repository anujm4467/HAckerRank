import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String f = "hackerrank";
            String s = in.next();
            int m = f.length();
            int n = s.length();
            boolean res = isValide(s, f, m, n);
		    if(res)
			   System.out.println("YES");
		    else
			   System.out.println("NO");
        }
    }
    public static boolean isValide(String s , String f, int m, int n)
    {
        int j=0 ;
        for(int i=0; i<n&&j<m; i++)
        {
            if(f.charAt(j) == s.charAt(i))
            {
                j++;
            }
        }
        return (j==m);
        
        
    }
}
