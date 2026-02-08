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
