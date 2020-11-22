//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
// Related Topics 回溯算法 
// 👍 532 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for(int num : nums){
            cur.add(num);
        }
        dfs(nums.length, 0, result, cur);
        return result;
    }

    public void dfs(int n, int position, List<List<Integer>> result, List<Integer> cur){
        if(n == position && !result.contains(cur)){
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
