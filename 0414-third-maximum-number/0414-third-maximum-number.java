class Solution {
    public int thirdMax(int[] nums) {
        Integer max1=null;
        Integer max2=null;
        Integer max3=null;
        for(Integer a:nums){
            if(a.equals(max1)||a.equals(max2)||a.equals(max3))continue;
                if(max1==null || a>max1){
                    max3=max2;
                    max2=max1;
                    max1=a;
                }
                else if(max2==null || a>max2){
                    max3=max2;
                    max2=a;
                }
                else if(max3==null || a>max3){
                    max3=a;
                } 
            }
        return max3 == null?max1 : max3;
    }
}
