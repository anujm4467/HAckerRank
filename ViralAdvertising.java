import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int people = 5;
        int sum = 0;
        int n = sc.nextInt();
      for (int i=0; i<n; i++){
             people = (int)Math.floor(people/2);
             sum += people;
             people *= 3;
     }
        System.out.println(sum);
}
}
