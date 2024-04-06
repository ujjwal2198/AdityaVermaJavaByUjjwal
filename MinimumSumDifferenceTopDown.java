
class Solution
{
    
	public int minDifference(int arr[], int n) {
    //  top Down 
	    // Range-2S ko minimum rakhana hai 
	    // t[n][range]
	      int range =0;
	    for(int temp : arr){
	        range+=temp;
	    }
	    boolean t[][] = new boolean[n+1][range+1];
	  
	    // important sum ka jo array hota hai wo ye batata hai ki
	    // ye sabset ho payega ya nhi with these particular combinationof
	    // elements taken 
	    for (int i = 0; i <= n; i++) {
		for (int j = 0; j <= range; j++) {
			if (i == 0)
				t[i][j] = false;
			if (j == 0)
				t[i][j] = true;
		}
	}
	 t[0][0] = true;
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=range;j++){
	            if(arr[i-1]>j){
	              t[i][j]=t[i-1][j];
	            }else{
	                t[i][j]= t[i-1][j] || t[i-1][j-arr[i-1]];
	            }
	        }
	    }
	    int min2 = Integer.MAX_VALUE;
	    int count=0;
	    for(int j=0;j<=(range/2);j++){
         if(t[n][j]){
          min2=Math.min(min2,Math.abs(range-2*j));
}
}
return min2;
}
}
