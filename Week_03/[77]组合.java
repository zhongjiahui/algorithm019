//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。 
//
// 示例: 
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
// Related Topics 回溯算法 
// 👍 442 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(k <= 0 || n < k){
            return result;
        }
        Deque<Integer> cur = new ArrayDeque<>();
        com(result, cur, n, k, 1);
        return result;
    }

    public void com(List<List<Integer>> result, Deque<Integer> cur, int n, int k, int begin){
        if(cur.size() == k){
            result.add(new ArrayList<>(cur));
            return;
        }

        for(int i = begin; i <= n; i++){
            cur.addLast(i);
            com(result, cur, n, k, i+1);
            cur.removeLast();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
