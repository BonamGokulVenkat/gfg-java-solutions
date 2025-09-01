class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int SecMax=-1;
        for(int num:arr){
            if(max<num){
                SecMax=max;
                max=num;
            }else if(SecMax<num&&num<max){
                SecMax=num;
            }
        }
        return SecMax;
    }
}