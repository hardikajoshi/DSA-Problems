class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
    
        for(int i=0;i<indices.length;i++){
          int store = indices[i];
        ans[store] = s.charAt(i);
        }
            
        return new String(ans);

    }
}