class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int i,j;
        int temp=0;
        for(i=0;i<image.length;i++){
            int start=0;
            int end = image[i].length-1;
            while(start<end){
                temp = image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp; 
                start++;
                end--; 
            } 
                } 
            for(i=0;i<image.length;i++){
            for(j=0;j<image[i].length;j++){
               if (image[i][j] == 0) {
                    image[i][j] = 1;
                } 
                else {
                    image[i][j] = 0;
                }  
        }
        
    }
    return image;
}

    }
