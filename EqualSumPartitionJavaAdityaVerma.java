
class Solution{
    static int equalPartition(int N, int arr[])
    {
        // if sum is odd we cant divide 
        // if even we can divide it 
        int sum=0;
        for(int i : arr){
            sum=sum+i;
        }
        if(sum%2!=0)
            return 0;
        else{
            sum=sum/2;
            return isSubset(arr,N,sum);
        }
            
    }
    static int isSubset(int arr[],int N,int target){
        // base case t[N,target]
        int t [][] = new int [N+1][target+1];
        // when N is 0 means no element false 
        Arrays.fill(t[0],0);
        for(int a[]: t){
            a[0]=1;
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=target;j++){
                if(arr[i-1]>j){
                    t[i][j]=t[i-1][j];
                }else {
                    t[i][j]=Math.max(t[i-1][j-arr[i-1]],t[i-1][j]);
                }
            }
        }
        
        return t[N][target];
        
    }
}
