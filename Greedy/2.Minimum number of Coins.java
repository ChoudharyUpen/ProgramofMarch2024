Example 1:
Input: N = 43
Output: 20 20 2 1
Explaination: 
Minimum number of coins and notes needed 
to make 43. 

class Solution{
    static List<Integer> minPartition(int N)
    {
        //ek array le liya 
       int []a= new int[]{1,2,5,10,20,50,100,200,500,2000};
      //value is arraylist ma store karwa rahe hai or fir return karwa rahe hai isa
       List<Integer> ans=new ArrayList<>();
      //array ko pecha se trasverse kar rahe hai
       int i=9;
       while(i>=0){
         //check kar raha hai ki kya given number array ka number sa bhada hai agar
         //hai tau pointer ko pecha kar rahe hai array mai
           if(a[i]>N){
               i--;
           }else{
             //agar array ka number chota ya barabr haii given number k
               while(N>=a[i]){
                 //tau arraylist ma add kar do or
                   ans.add(a[i]);
                 //or given number mai sa arraylist ka number minus kar do
                   N-=a[i];
               }
           }
       }return ans;
        
    }
}
