class Solution {
    public long count(int coins[], int N, int sum) {
       long data [][]= new long[N+1][sum+1];
       // n--------- 00000
       //0 0 1
       Arrays.fill(data[0],0);
       data[0][0]=1;
       for(int i=1;i<=N;i++){
           for(int j=0;j<=sum;j++){
               if(coins[i-1]>j){
                   data[i][j]=data[i-1][j];
               }else{
                   data[i][j]=data[i-1][j]+data[i][j-coins[i-1]];
               }
           }
       }
       return data[N][sum];
    }
}
