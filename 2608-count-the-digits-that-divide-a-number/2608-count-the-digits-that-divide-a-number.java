class Solution {
    public int countDigits(int num) {
        int count=0;
        // ArrayList<Integer> list = new ArrayList<>();
        int temp = num;
        while(temp>0){
            int digit= temp % 10;
            // list.add(digit);
            if(num%digit==0){
                count++;
            }
            temp=temp/10;
        }
        return count;
        
    }
}