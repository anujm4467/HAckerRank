import java.util.*;
import java.lang.*;
import java.io.*;

public class ClimbingLeaderBoard 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] scores = new int[n];
      int[] ranks = new int[n];
      
      for(int i=0,rank=1; i<n; i++)
      {
    	  int s = sc.nextInt();
    	  scores[i] = s;
    	  if(i>0 && scores[i-1]!=s)
    		  rank++;
    	  ranks[i] = rank;
      }
      
      int aliceRank = ranks[ranks.length-1]+1;
      int leaderBoardIndex = n-1;
      int m = sc.nextInt();
      int prvScore = -1;
      
      for(int j =0; j<m; j++)
      {
    	  int levelScore = sc.nextInt();
    	  for(int i=leaderBoardIndex; i>=-1; i--)
    	  {
    		  if(i<0 || scores[i]>levelScore)
    		  {
    			  System.out.println(aliceRank);
                  break;
    		  }
    		  else if(scores[i]<levelScore)
    		  {
    			  if(scores[i] != prvScore)
    			  {
    				  aliceRank--;
    			  }
    			  leaderBoardIndex--;
    		  }
    		  else
    		  {
    			  leaderBoardIndex--;
    			  aliceRank = ranks[i];
    		  }
    		  prvScore = scores[i];
    	  }
      }

	}

}
