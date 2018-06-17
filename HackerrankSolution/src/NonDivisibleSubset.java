import java.util.*;

public class NonDivisibleSubset 
{
	public static int subsetNonDivisible(int arr[], int n, int k)
	{
	    int f[] = new int [k];
	    
	    for(int i=0; i<n; i++) 
		   f[arr[i]%k]++;
	    
	    if(k%2==0)
	    	f[k/2]= Math.min(f[k/2],1);
	    
	    int result = Math.min(f[0],1);
	    
	    for(int i=1; i<=k/2; i++)
	    	result += Math.min(f[i], f[k-i]);
	    return result;
	}
	
	public static void main(String[] args)
	{
		  int arr[] = {3, 7, 2, 9, 1};
	      int N = arr.length;
	      int K = 3;
	      
	      System.out.println(subsetNonDivisible(arr, N, K));
	}
}
