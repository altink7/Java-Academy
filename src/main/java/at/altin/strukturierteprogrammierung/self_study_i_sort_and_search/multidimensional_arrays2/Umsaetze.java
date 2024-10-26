package at.altin.strukturierteprogrammierung.self_study_i_sort_and_search.multidimensional_arrays2;

import java.util.Scanner;

public class Umsaetze {
    static Scanner sc;

    public static void printRevenues(int[][] revenues) {
        System.out.println("revenues:");
        for (int[] branch : revenues) {
            for (int rev : branch) {
                System.out.printf("%2d ", rev);
            }
            System.out.println();
        }
    }

    public static int[][] scanRevenues(int branches, int days) {

        int[][] revenues = new int[branches][days];
        for (int i = 0; i < branches; i++) {

            for (int j = 0; j < days; j++) {
                System.out.print(": ");
                revenues[i][j] = sc.nextInt();
            }
        }
        return revenues;

    }

    public static int sumDay(int[][]revenues, int day){
        int sum=0;
        for(int i=0; i<revenues.length; i++)
            sum += revenues[i][day];
        return sum;
    }

    public static int sumBranch(int[][]revenues, int branch){
        int sum=0;
        for(int i=0; i<revenues[branch].length; i++)
            sum += revenues[branch][i];
        return sum;
    }

    public static int[] daySummary(int[][] revenues){
        int[] daySummary = new int[revenues[0].length];
        for(int i=0; i<revenues[0].length; i++){
            daySummary[i] = sumDay(revenues,i);
        }
        return daySummary;
    }

    public static int[] branchSummary(int[][] revenues){
        int[] branchSummary = new int[revenues.length];
        for(int i=0; i<revenues.length; i++){
            branchSummary[i] = sumBranch(revenues,i);
        }
        return branchSummary;
    }


    public static int maxIdx(int[] arr) {
        int idx=0;
        for (int i=0; i<arr.length;i++)
            if(arr[i]>arr[idx])
                idx = i;
        return idx;
    }

    public static int[] maxRev(int[][] revenues){
        int[] max={0,0};
        for(int i=0; i<revenues.length;i++){
            for(int j = 0; j < revenues[i].length; j++){
                if(revenues[i][j] > revenues[max[0]][max[1]]){
                    max[0]= i;
                    max[1]=j;
                }
            }
        }
        return max;

    }

    public static void app() {
        System.out.printf("branches: ");
        int branches=sc.nextInt();
        System.out.printf("days: ");
        int days = sc.nextInt();
        /* int[][] rev = {
				{ 1, 2, 3, 4, 5 },
				{ 11, 21, 31, 41, 51 },
				{ 21, 22, 23, 24, 25 },
				{ 10, 20, 30, 40, 50 },
				{ 41, 42, 43, 44, 45 },
				};*/
        int[][] rev = scanRevenues(branches, days);
        printRevenues(rev);

        System.out.printf("day Summary: ");
        int[] daySummary = daySummary(rev);
        for(int n:daySummary)
            System.out.printf("%d ", n);
        System.out.println();
        int maxday = maxIdx(daySummary);
        System.out.printf("max day is day %d with total revenue of %d.\n", maxday, daySummary[maxday]);


        System.out.printf("branch Summary: ");
        int[] branchSummary = branchSummary(rev);
        for(int n:branchSummary)
            System.out.printf("%d ", n);
        System.out.println();
        int maxbranch = maxIdx(branchSummary);
        System.out.printf("max branch is branch %d with total revenue of %d.\n", maxbranch, branchSummary[maxbranch]);
        int[]m = maxRev(rev);
        System.out.printf("max revenue of %d in branch %d on day %d.\n", rev[m[0]][m[1]], m[0], m[1]);
    }



    /*------------ DO NOT TOUCH ----------------*/

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Test[] tests = {new PrintRevenueTest(),
                new ScanRevenuesTest(),
                /*new PrintDayTest(),
                new PrintBranchTest(),*/
                new SumDayTest(),
                new SumBranchTest(),
                new DaySummaryTest(),
                new BranchSummaryTest(),
                new MaxIdxTest(),
                new MaxRevTest(),
                new AppTest()
        };

        System.out.printf("Test#: ");
        int n=sc.nextInt();
        if(n<1 || n> tests.length+1){
            System.out.println("unknown test.");
            return;
        }
        tests[n-1].run();
        sc.close();
    }

    private abstract static class Test{
        protected abstract void exec();
        void run(){
            System.out.printf("executing %s\n", this.getClass().getSimpleName());
            exec();
        }

        protected int[][] initRevenues() {
            int[][] rev = {
                    {121, 146, 126, 111, 152},  //
                    {129, 127, 195, 189, 130}, //
                    {199, 131, 197, 187, 117}, //
                    {106, 163, 173, 186, 133}, //
                    {118, 125, 140, 170, 119}, //
                    {193, 158, 192, 169, 124}, //
                    {120, 165, 157, 162, 134}, //
                    {114, 155, 181, 132, 159}, //
                    {191, 144, 112, 190, 115}, //
                    {161, 176, 137, 142, 153}, //
                    {100, 179, 136, 183, 122}, //
                    {99, 151, 184, 141, 194}, //
                    {166, 109, 188, 143, 116}, //
                    {182, 171, 198, 138, 145}, //
                    {175, 178, 123, 174, 113}, //
                    {101, 185, 135, 107, 147}, //
                    {172, 103, 149, 108, 180}, //
                    {139, 156, 167, 154, 196}, //
                    {128, 110, 160, 105, 164}, //
                    {148, 102, 150, 177, 168} //
            };
            return rev;
        }
    }

    private static final class PrintRevenueTest extends Test{
        @Override
        protected void exec() {
            printRevenues(initRevenues());
        }
    }

    private static final class ScanRevenuesTest extends Test{
        @Override
        protected void exec() {
            int branches=sc.nextInt();
            int days = sc.nextInt();
            int[][] rev =scanRevenues(branches, days);
            printRevenues(rev);

        }
    }

    private static final class SumDayTest extends Test{
        @Override
        protected void exec() {
            System.out.printf("%d\n",sumDay(initRevenues(), sc.nextInt()));
        }
    }

    private static final class SumBranchTest extends Test{
        @Override
        protected void exec() {
            System.out.printf("%d\n",sumBranch(initRevenues(), sc.nextInt()));
        }
    }

    private static final class DaySummaryTest extends Test{
        @Override
        protected void exec() {
            for(int n:daySummary(initRevenues()))
                System.out.printf("%d ", n);
            System.out.println();
        }
    }

    private static final class BranchSummaryTest extends Test{
        @Override
        protected void exec() {
            for(int n:branchSummary(initRevenues()))
                System.out.printf("%d ", n);
            System.out.println();
        }
    }

    private static final class MaxIdxTest extends Test{
        @Override
        protected void exec() {
            int[][] rev = initRevenues();
            System.out.printf("%d\n",maxIdx(rev[0]));
            System.out.println();
        }
    }

    private static final class MaxRevTest extends Test{
        @Override
        protected void exec() {
            int[]mr=maxRev(initRevenues());
            System.out.printf("%d %d\n",mr[0], mr[1]);
        }
    }

    private static final class AppTest extends Test{
        @Override
        protected void exec() {
            app();
        }
    }

    /*-------------------------------------------*/
}
