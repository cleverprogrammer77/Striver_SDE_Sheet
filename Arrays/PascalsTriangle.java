import java.util.*;

class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of rows");
        int numRows = sc.nextInt();
        System.out.println(generatePascal(numRows));
        sc.close();
    }

    public static List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row, pre;
        pre = null;
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            result.add(row);
        }

        return result;
    }
}