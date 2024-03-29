
class Solution{
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        // sum we have to check it is achievable or not
        // N is the value of array 
        // base condition sum =0 true ... agar n=0 to false hoga 
        // t[sum][N] 
        Boolean t [][] = new Boolean [sum+1][N+1];
        Arrays.fill(t[0],true);
        for(Boolean a[] : t){
            a[0]=false;
        }
        t[0][0] = true;
        
        for(int i =1;i<=sum;i++){
            for(int j=1;j<=N;j++){
                if(arr[j-1]>i){
                    t[i][j]=t[i][j-1];
                }
                else{
                    t[i][j]=t[i-arr[j-1]][j-1] || t[i][j-1];
                }
            }
        }
        
        return t[sum][N];
    
    }
}
