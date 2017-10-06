 
package hackerrank;
import java.util.*;

/** input 
3 2 3 n = 3 , k = 2 , q = 3
1 2 3  arr[n]
0 1 2
output -
2 3 1
 * @Anuj Mishra (anujm4467 -github)
 */
public class CircularArray {
   
    public static void main(String args[])  
    {
         Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();  // No of element in the array
            int K = sc.nextInt();  // No of time of rotation 
            int Q = sc.nextInt();  // No of times  Query on the array 
            int rot = K % N;         // 2%3 = 2 
            System.out.println("Rotation is :"+rot);
            int arr[] = new int[N];
            for (int i = 0; i < N; i++)
            {
            arr[i] = sc.nextInt();
            }
            for(int i=0; i<Q; i++)
            {
                int index = sc.nextInt();
                if(index - rot >= 0){
                    System.out.println(arr[index -  rot]);
                }
                else{
                    System.out.println(arr[index - rot + arr.length]);
                }
            }
   }
}
