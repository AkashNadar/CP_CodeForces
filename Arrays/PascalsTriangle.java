class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            result.add(buildList(i));
        }
        return result;
    }

    public List<Integer> buildList(int row) {
        int ans = 1;
        List<Integer> pascalList = new ArrayList<Integer>();
        pascalList.add(ans);
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            pascalList.add(ans);
        }
        return pascalList;
    }
}