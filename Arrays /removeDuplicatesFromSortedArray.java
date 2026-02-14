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
