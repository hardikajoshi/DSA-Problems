class Solution {
    public boolean isPalindrome(String s) {
        // if (s.isEmpty()) {
        // 	return true;
        // }
        int i = 0;
        int j = s.length() - 1;
        // s.toLowerCase();
        while(i <= j) {
        	char start = s.charAt(i);
        	char end = s.charAt(j);
        	if (!Character.isLetterOrDigit(start)) {
        		i++;
        	} else if(!Character.isLetterOrDigit(end)) {
        		j--;
        	} else {
        		if (Character.toLowerCase(start) !=Character.toLowerCase(end)) {
        			return false;
        		}
        		i++;
        		j--;
        	}
        }
        return true;
    }
}