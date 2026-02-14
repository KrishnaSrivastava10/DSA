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
    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        if (arr.length == 0)
            return result;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            result.add(arr[k]);
        }

        return result;
    }
}

// TC - 
// O(n)
