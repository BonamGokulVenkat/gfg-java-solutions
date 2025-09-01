class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        return max;
    }
}
