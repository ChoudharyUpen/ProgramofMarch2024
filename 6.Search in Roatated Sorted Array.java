Search in Rotated Sorted Array -----------
(the question was tagged as medium intiali i thought how i gona do this it is medium question as i have only solved easy question till now but tried and completed in 15 min 
question -- it asks as to return the index of targeted value given by the user)

class Solution{
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }   
        }return -1;
    }
}
