
public class Day27 {

    Day27(int n, int k, int[] a) {
        System.out.println(n + " " + k);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // number of test cases - each test case is two lines
        int testCases = 5;

        System.out.println(testCases);
        Day27 day27 = new Day27(4, 3, new int[]{-1, 0, 4, 2});
        Day27 day271 = new Day27(5, 2, new int[]{0, -1, 2, 1, 4});
        Day27 day272 = new Day27(7, 6, new int[]{2, 0, -1, 1, 1, 1, 1});
        Day27 day273 = new Day27(3, 1, new int[]{-1, 0, 4});
        Day27 day274 = new Day27(6, 4, new int[]{0, -1, 1, 4, 5, 6});
    }
}
