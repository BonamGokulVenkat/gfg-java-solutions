import java.util.*;

class Solution {
    
    static int[] findIndex(int arr[], int key) {
        
        ArrayList<Integer> list= new ArrayList<>();
        boolean found=false;
        int temp=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key&&!found){
                list.add(i);
                found=true;
                temp=i;
            }else if(arr[i]==key){
                temp=i;
            }
        }
        list.add(temp);
        if(!found) return new int[]{-1,-1};
        return new int[]{list.get(0),list.get(1)};
    }
}