// BRUTE FORCE 

// firstly sort the array and then call this - 

for(int i=n-2;i>=0;i--){
  if(arr[i] != largest){
    secondLargest = arr[i];
    break;
  }
}

// TC -
// SORT - O(nlogn) 
// Traversing to find second largest - O(n)
// = O(nlogn) 



// BETTER APPROACH

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest) largest = arr[i];
        }
        
        int secondLargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=largest) secondLargest = arr[i];
        }
        
        return secondLargest;
    }
}

// TC - 
// O(2N)



// OPTIMAL APPROACH

