Input:
N = 4
A = {4,1,8,7}
B = {2,3,6,5}
Output:
6
Explanation:
If we take the pairings as (1,2), (4,3),
(7,5), and (8,6), the sum will be S =
|1 - 2| + |4 - 3| + |7 - 5| + |8 - 6| = 6.
It can be shown that this is the minimum sum we can get.
  
//it was an easy i did it in 20 min nothing much just you have to observe input output of this 
//program and its done 
//in this question we have to find minmum sum of 2 arrays
class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
      //Step 1 Sort Them
        Arrays.sort(A);
        Arrays.sort(B);
      //Intialise a sum long learning first it was int so it was failing one test case
        long sum=0;
      
        for(int i=0;i<A.length;i++){
          //Math.abs function
            sum+=Math.abs(A[i]-B[i]);
        }
        return sum;
    }
}
