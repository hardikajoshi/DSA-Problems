class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left ; i<=right; i++){
            int temp = i;
            int count = 0;
        while(temp > 0){
            int digit = temp % 10;
            if(digit == 0){
                count = 0;
                break;
            }
            else if(i % digit == 0){
                count++;
                temp = temp / 10;
            }
            else{
                count = 0;
                break;
            }
        }
        if(count > 0)
            list.add(i);
        }
        
        return list;
    }
}