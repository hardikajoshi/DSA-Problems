class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans= new int[m][n];
        for(int i=0;i<indices.length;i++){// to traverse through indices array
            for(int j=0;j<n;j++){// for updating the col in ans array
                ans[indices[i][0]][j]++;// for updating col we keep row constant
            }
            for(int j=0;j<m;j++){//for updating row in ans array
                ans[j][indices[i][1]]++;//for updating row we keep col constant
            }
        }
        int count=0;
        for(int i=0;i<m;i++){//traversing to check for odd values
            for(int j=0;j<n;j++){
                if(ans[i][j]%2!=0){
                    count++;
                }

            }
        }
        
return count;
    }
}