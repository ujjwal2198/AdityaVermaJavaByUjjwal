class Solution {
            int data[][]= new int[1000+1][1001];
    public int longestCommonSubsequence(String text1, String text2) {    
        for(int tArr[] : data){
            Arrays.fill(tArr,-1);
        }
     return   recursiveLcs(text1,text2,text1.length(),text2.length());
    }
    public int recursiveLcs(String text1,String text2,int l1,int l2){   
        if(data[l1][l2]!=-1)
            return data[l1][l2];
        if(l1==0 || l2==0){
            return 0;
        }
        if(text1.charAt(l1-1)==text2.charAt(l2-1)){
            data[l1][l2] =1+recursiveLcs(text1,text2,l1-1,l2-1);
            return data[l1][l2];
        }else{
             data[l1][l2] =Math.max(recursiveLcs(text1,text2,l1,l2-1),recursiveLcs(text1,text2,l1-1,l2));
             return data[l1][l2];
        }
    }
}
