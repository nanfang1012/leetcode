//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//Java：两数之和
public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 26);
        for (int i : ints){
            System.out.println(i);
        }
        // TO TEST
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //第一种解法，不美好
            /*int[] resultIndexArray = new int[2];
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        resultIndexArray[0] = i;
                        resultIndexArray[1] = j;
                        return resultIndexArray;
                    }
                }
            }
            return null;*/
            //最优解法，哈希表
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++){
                int num = target - nums[i];
                if(map.containsKey(num)){
                    return new int[]{map.get(num), i};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}