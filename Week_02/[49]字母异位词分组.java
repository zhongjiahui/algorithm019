//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。 
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明： 
//
// 
// 所有输入均为小写字母。 
// 不考虑答案输出的顺序。 
// 
// Related Topics 哈希表 字符串 
// 👍 518 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(null == strs || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List> result = new HashMap<String, List>();
        for(int i = 0; i < strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String key = String.valueOf(str);
            if(!result.containsKey(key)){
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(strs[i]);
        }
        return new ArrayList(result.values());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
