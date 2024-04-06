
class Solution 
{ 
    static int t[][] =new int[1001][1001];
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        // max value + choice hai lena hai ya nhi lena hai 
        // value nikalana hai 
        // W < wt[] == le hi nhi paoga (bandi jise dekh pata )
        // W >= wt[] == pat b sakti or nhi pat hai 
        // apne ko at the end jo b mile ko top max honi chahiye 
        // Recursive Approach
        
        for(int a [] : t){
            Arrays.fill(a,-1);
        }
        
       return knapSack2(W, wt, val,n) ;
        
    } 
    
    static int knapSack2(int W, int wt[], int val[], int n) 
    { 
        // max value + choice hai lena hai ya nhi lena hai 
        // value nikalana hai 
        // W < wt[] == le hi nhi paoga (bandi jise dekh pata )
        // W >= wt[] == pat b sakti or nhi pat hai 
        // apne ko at the end jo b mile ko top max honi chahiye 
        // Recursive Approach
      
        
        if(n==0 || W==0){
            return 0;
        }
        if(t[n][W]!=-1){
            return t[n][W];
        }
        
        if(wt[n-1]>W){
            t[n][W]=knapSack2(W,wt,val,n-1);
             
        }else {
            t[n][W]=Math.max(val[n-1]+knapSack2(W-wt[n-1],wt,val,n-1),knapSack2(W,wt,val,n-1));
             
        }
        
        return t[n][W];
        
    } 
    
    
}


