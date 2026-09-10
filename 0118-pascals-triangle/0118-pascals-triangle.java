class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {

            long value = 1;
            List<Integer> ansRow = new ArrayList<>();

            ansRow.add(1);

            for (int col = 1; col < row; col++) {

                value = value * (row - col);
                value = value / col;

                ansRow.add((int) value);
            }

            ans.add(ansRow);
        }

        return ans;
    }
}
        

