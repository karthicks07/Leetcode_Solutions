class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        int a=0;
        while(n>0)
        {
            a=n%10;
            s+=a;
            p*=a;
            n/=10;
        }
        return p-s;
    }
}
