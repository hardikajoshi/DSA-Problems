class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder builder= new StringBuilder();
     s = s.toLowerCase();
     s = s.replaceAll("[^A-Za-z0-9]", "");
     for(int i=s.length()-1;i>=0;i--){
         builder.append(s.charAt(i));
     }
     for(int j=0;j<s.length();j++){
          if(s.charAt(j)!=(builder.charAt(j))){
             return false;
     }
     }
     return true;

    }
}