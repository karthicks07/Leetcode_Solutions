class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int c=0;
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i && nums[j]<nums[i])
                {
                    c++;
                }
            }
            n[i]=c;
        }
        return n;
    }
}
