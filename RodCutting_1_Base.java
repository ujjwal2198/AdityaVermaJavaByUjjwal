// indexing ka kuch game hai 
// one base indexing
class Solution{
    public int cutRod(int price[], int n) {
        //code here
        int data [][]=new int[n+1][n+1];
        int index=price.length;
        // when no value  then 0
        // when no length 0
        for(int i=1;i<=index;i++){
            for(int j=1;j<=n;j++){
                if((i)>j){
                    data[i][j]=data[i-1][j];
                }else
                data[i][j]=Math.max(data[i-1][j] , price[i-1]+data[i][j-(i)]);
            }
        }
        
        return data[n][n];
        
    }
}
