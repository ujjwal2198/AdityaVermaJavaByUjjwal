class Solution 
{ 
    // was getting confuse in I J with W and N 
    // mostly W
    
    static int knapSack(int W,int wt[],int val[],int n){
        //base case ki bat 
        // change kya ho rha W,n
        // W=0 to sab 0 capacity hi nhi hai 
        // or agar n 0 to sab zero cause value hi nhi hai 
        // row =n = i colum =w=j
         int t[][] =new int[n+1][W+1];

        Arrays.fill(t[0],0);
        for(int a[] : t){
            a[0]=0;
        }
        for(int i=1;i<=n;i++){ // n
            for(int j=1;j<=W;j++){ // weight
                if(wt[i-1]>j){
                    t[i][j]=t[i-1][j];
                }else{
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }
            }
        }
        
        
       
        return t[n][W];
    }
}
