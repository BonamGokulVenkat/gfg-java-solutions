/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(!isPalin(arr[i])) return false;
        }
        return true;
    }
    public static boolean isPalin(int num){
        String str= Integer.toString(num);
        String reverse= new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}