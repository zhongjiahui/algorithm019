//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法 
// 👍 1007 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for(int num : nums){
            cur.add(num);
        }
        dfs(nums.length, 0, result, cur);
        return result;
    }

    public void dfs(int n, int position, List<List<Integer>> result, List<Integer> cur){
        if(n == position){
            result.add(new ArrayList<Integer>(cur));
        }
        for(int i = position; i < n; i++){
            Collections.swap(cur, position, i);
            dfs(n, position+1, result, cur);
            Collections.swap(cur, position, i);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
