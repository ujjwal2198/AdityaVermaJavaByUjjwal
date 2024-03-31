class Solution {
   public int findTargetSumWays(int[] nums, int target) {
   // 2 subset hai 
   // S-S1= D how many type
   // S+S1=R
   // S = (D+R)/2
   int range = 0;
   for(int i=0;i<nums.length;i++){
      range+=nums[i];
    }
  int requiredSum = (range+target)/2;
  if((range+target)%2!=0  || range<Math.abs(target)) {
      return 0;
  }
return countRequiredSum(requiredSum,nums,nums.length);
}
public int countRequiredSum(int rSum, int nums[],int len){
        int data[][]=new int[len+1][rSum+1];
Arrays.fill(data[0],0);
        data[0][0] = 1;for(int i=1;i<=len;i++){
            for(int j=0;j<=rSum;j++){
                if(nums[i-1]>j){
                    data[i][j]=data[i-1][j];
                }else{
                    data[i][j]=data[i-1][j]+data[i-1][j-nums[i-1]];
                }
          }
        }
        return data[len][rSum];
    }
}

