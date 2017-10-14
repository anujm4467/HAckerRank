import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String all = "abcdefghijklmnopqrstuvwxyz";
        String test = "";
        for(int i = 0; i < s.length(); i++){
            test = (""+s.charAt(i)).toLowerCase();
            if(all.contains(test)){
               // System.out.println(test);
                all = all.replace(test,"");
                //System.out.println(all);
                if(all.isEmpty()){
                    System.out.println("pangram");
                    break;
                }
            }
        }
        if(!all.isEmpty()){
            System.out.println("not pangram");
        }
    }
}
