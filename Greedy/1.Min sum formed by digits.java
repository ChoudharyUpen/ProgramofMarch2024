//Input and Output of Array
Input:
N = 6
arr[] = {6, 8, 4, 5, 2, 3}
Output:
604
Explanation:
The minimum sum is formed by numbers 
358 and 246
//this question is nothing but taking even and odd postion after sorting an array and adding them
class Solution {
    public static long minSum(int arr[], int n)
    {
       Arrays.sort(arr);
       long a=0;
       long b=0;
      // Iteration over Array
       int i=0;
       while(i<n){
          //Adding the number in a
           a=a*10+arr[i];
           i++;
           //condition if array length is odd 
          //Adding the number in b
           if(i<n)b=b*10+arr[i];     
           i++;
       }return a+b;
    }
