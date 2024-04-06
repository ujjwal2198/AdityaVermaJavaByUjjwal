class Solution{
	public int minCoins(int coins[], int M, int V) {
	    // try to understand what questionis being asked firstly ok
	    // now here minimum no of coins required to make the sum 
	    // there can be scnerio in which we can make taht coin then may be -1
	    // ok sare combination try karte hai valid wale and then min ko le lete hai 
	    if(V<0)
	    return -1;
	    if(V==0){
	        return 0;
	    }
	    if(M==0){
	        return -1;
	    }
	    int minCoinDp [] = new int [V+1];
	        for(int j=1;j<=V;j++){
	            	 minCoinDp[j]=Integer.MAX_VALUE;
	            for(int i=1;i<=M;i++){
	            // ASSUMING KI j nhi ban sakta 
	            if(coins[i-1]<=j && minCoinDp[j-coins[i-1]]!=Integer.MAX_VALUE) {
	                minCoinDp[j]=Math.min(minCoinDp[j],1+ minCoinDp[j-coins[i-1]]);
	            }
	        }
	    }
	    int c=0;
	    if(minCoinDp[V]!=Integer.MAX_VALUE)
	         return minCoinDp[V];
	    else
	         return -1;
	} 
}
