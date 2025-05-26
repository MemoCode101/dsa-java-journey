class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int result = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==x){
                    result = 1;
                }
                
                
            }
        }
        
        if (result==1){
            return true;
        }else{
            return false;
        }
    }
}
