class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // data[N+1][W+1] = N =0 {false} W=0 {true}
        int data[][] = new int [N+1][W+1];
        // no need to initiize because value will be zero when W or N is zero
        // so it is expected
        // data[0][0]=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    data[i][j]=Math.max(data[i-1][j] , val[i-1]+ data[i][j-wt[i-1]]);
                }else{
                    data[i][j]=data[i-1][j];
                }
            }
        }
        return data[N][W];
    }
}
