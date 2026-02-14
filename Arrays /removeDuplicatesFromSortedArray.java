//BRUTE APPROACH
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        Set<Integer> set= new LinkedHashSet<>();
        for(int x: arr){    // - nlogn
            set.add(x);
        }
        
        int index = 0;
        int n = set.size();
        int[] result = new int[n];
        
        for(int x:set){    // - n
            result[index++] = x;
        }
        
        return new ArrayList<>(set);
        
    }
}

// TC -
// O(nlogn)


// OPTIMAL 
// 2 POINTERS

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}

// TC - 
// O(n)
