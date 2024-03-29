Valid Anagram
class Solution {
    public boolean isAnagram(String s, String t) {
      //agar dono t or s ki length barbar nahi hai tau turant exit
       if(s.length()!=t.length()){
           return false;
       }
      //This array is used to store the count of occurrences of each character in the string s
       int[] count=new int[26];
      //Count Characters in s: The method iterates through each character of the string s using a for-each loop
       for(char ch:s.toCharArray()){
           count[ch-'a']++;
       }
      //Decrement Counts for Characters in t: Similarly, the method iterates through each character of the string t using a for-each loop.
       for(char ch:t.toCharArray()){
           count[ch-'a']--;
       }
      //   Check if Counts are Zero:  if any element in the array is not zero, it means that the frequency of some character in s is different from that in t, indicating that s and t are not anagrams. 
       for(int val:count)
       {
           if(val!=0)
           {
           return false;
       }
       }
       return true;
    }
}
