

public class Problem997 {
    public static void main(String[] args) {
        int [][] nums = {{1,2},{2,3}};
        int n = 3;
        System.out.println(findJudge(n,nums));

    }

    public static int findJudge(int n, int[][] trust) {
        int [] help = new int[n];
        for (int i = 0; i < n; i++) {
            help[i] = i + 1;
        }
        for (int i = 0; i < trust.length; i++) {
            help[trust[i][0]-1] = -1;
        }
        int num = -1;
        for (int i = 0; i < n; i++) {
            if(help[i] != -1) num = help[i];
        }
        return num;
    }
}

