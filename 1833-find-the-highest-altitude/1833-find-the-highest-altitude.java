class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int i;
        int max=0;
        int altitude=0;
        for(i=0;i<n;i++){
            altitude = altitude + gain[i];
            if(altitude>max){
                max= altitude;
            }
        }
        return max;
    }
}