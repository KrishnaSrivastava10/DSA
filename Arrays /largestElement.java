// BRUTE FORCE APPROACH

  class Solution {
    public static int largest(int[] arr) {
        quickSort(arr,0,arr.length-1);
        return arr[arr.length-1];
    }
    
    private static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pIndex = partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    
    private static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
}


// TC - 
// Average: O(n log n)
// Worst: O(n²)
// Space: O(log n)
// SC - 
// Average case: O(log n)
// Worst case: O(n)


// OPTIMAL SOLUTION

class Solution {
    public static int largest(int[] arr) {
    int n = arr.length;
    int max = arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    
    return max;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
