class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int mmi = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mmi]){
                    mmi = j;
                }
            }
            int temp = arr[mmi];
            arr[mmi] = arr[i];
            arr[i] = temp;
        }
    }
}
