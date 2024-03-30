
class Solution
{
	public int minDifference(int arr[], int n) 
	{ 
	    // array diya hai or size n hai 
	    // absolute difference minimum
	    // S1 , R-S1 ===> (R-2S1) Should be minimum
	    int range=0;
	    int currentSum=0;
	    for(int temp : arr){
	        range+=temp;
	    }
	    int dataArr [][] = new int[n+1][range+1];
	    for(int temp[] :dataArr){
	        Arrays.fill(temp,-1);
	    }
	    return Recursive(arr,n,range,currentSum,dataArr);
	} 
	public int Recursive(int arr[],int n,int range,int currentSum,int[] []dataArr){
	    
	    if(n==0){
	        return Math.abs(range-2*currentSum);
	    }
	    if(dataArr[n][currentSum]!=-1)
	       return dataArr[n][currentSum];

	    
	    dataArr[n][currentSum] = Math.min(Recursive(arr,n-1,range,currentSum+arr[n-1],dataArr),
	                Recursive(arr,n-1,range,currentSum,dataArr));
	    return dataArr[n][currentSum];
	}
}
