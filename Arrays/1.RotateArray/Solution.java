class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d%=n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
    }
    static void rotate(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
