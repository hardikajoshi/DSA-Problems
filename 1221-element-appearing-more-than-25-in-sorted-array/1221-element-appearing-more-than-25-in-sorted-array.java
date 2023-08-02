class Solution {
    public int findSpecialInteger(int[] arr) {
        int i,j;
        for(i=0;i<arr.length;i++){
            int count=0;
            for(j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count> arr.length/4)
            return arr[i];
        }
       return -1;
    }
}