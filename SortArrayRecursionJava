class Solution {
    public int[] sortArray(int[] nums) {
        int n= nums.length;
        List <Integer> numberList = new ArrayList<>();
        for(int a : nums){
            numberList.add(a);
        }
        recurSort(numberList);
        int a[] =numberList.stream().mapToInt(Integer::intValue).toArray();
        
        return a;
    }

    public void recurSort( List<Integer> res){
        // ye man liya ki hame n-1 ko sort kar diya 
        // ab bus n term ko usme put karna hai mujhe [1,2,5,7] = 3 
        // base case agar 1 hai to sare sorted h man liya 
        if(res.size()==1){
            return ;
        }
        int temp = res.remove(res.size() - 1);
        recurSort(res);
        // yha par sorted array apun ko prapt hua hai 
        // ab apan isme  [1,2,5,7] = 3 put karega
        insert(res,temp);
        return;
    }
    public void insert(List<Integer> res,int temp ){
        //  [1,2,5,7] = 3 
        // ab isme hypo ye hai ki hame n-1 term ke liye 
        // [1,2,5] me 3 put mil jayega == [1,2,3,5]
        // mujhe bus 7 add karna hai last me [1,2,3,5,7]
        // base condition matlab rukna kab hai so 
        if(res.size()==0 || res.get(res.size()-1)<=temp){
            res.add(temp);
            return;
        }
        int temp2 = res.remove(res.size()-1);
        insert(res,temp);
        // induction step 
        res.add(temp2);
        return;
    }
}
