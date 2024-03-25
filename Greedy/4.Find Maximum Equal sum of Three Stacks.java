Input:
N1 = 3, N2 = 4, N3 = 2
S1 = {4,2,3}
S2 = {1,1,2,3}
S3= {1,4}
Output:
5
Explanation:
We can pop 1 element from the 1st stack, and 2
elements from the 2nd stack. Now remaining elements
yield the equal sum of the three stacks, that is 5.


//In this question we find sum of all 3 arrays 
//then find the stack with maximum sum and remove the stack
// If any stack is empty(if any one of stack is empty and all 3 sum is not equal then there 
//is not maxximum
// If sum of all three stack are equal.(if all are 5 5 5 then we have find the answer)
class Solution 
{
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) 
    {
         int sum1 = 0, sum2 = 0, sum3 = 0;
       
      // Finding the initial sum of stack1.
      for (int i=0; i < N1; i++)
          sum1 += S1[i];
      
      // Finding the initial sum of stack2.
      for (int i=0; i < N2; i++)
          sum2 += S2[i];
      
      // Finding the initial sum of stack3.
      for (int i=0; i < N3; i++)
          sum3 += S3[i];
      
      // As given in question, first element is top
      // of stack..
      int top1 =0, top2 = 0, top3 = 0;
      int ans = 0;
      while (true)
      {
          // If any stack is empty
          if (top1 == N1 || top2 == N2 || top3 == N3)
             return 0;
      
          // If sum of all three stack are equal.
          if (sum1 == sum2 && sum2 == sum3)
             return sum1;
          
          // Finding the stack with maximum sum and 
          // removing its top element.
          if (sum1 >= sum2 && sum1 >= sum3)
             sum1 -= S1[top1++];
          else if (sum2 >= sum1 && sum2 >= sum3)
             sum2 -= S2[top2++];
          else if (sum3 >= sum2 && sum3 >= sum1)
             sum3 -= S3[top3++];
      }
    } 
}
