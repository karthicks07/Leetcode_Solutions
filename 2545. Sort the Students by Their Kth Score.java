class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++)
        {
            for(int j=0;j<score.length;j++)
            {
                if(score[i][k]>score[j][k])
                {
                    int[] t=score[i];
                    score[i]=score[j];
                    score[j]=t;
                }
            }
        }
        return score;
    }
}
