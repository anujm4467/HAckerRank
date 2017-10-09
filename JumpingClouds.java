import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* 
8 2
0 0 1 0 0 1 1 0

92
*/
public class JumpingClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int energy = 100;
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        for(int i=0; i<n; i+=k)
        {
            if(c[i] == 1){
                energy -= 3;
            }else if(c[i] == 0){
                energy -= 1;
            }
        }
        System.out.println(energy);
    }
}
