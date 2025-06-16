class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int size =arr.length;
        int []freq=new int[size];
        for(int i=0;i<size;i++){
            int index=arr[i]-1;
            freq[index]++;
        }
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<size;i++){
            if(freq[i]==0){
                al.add(i+1);
            }
        }
        return al;   
    }
}