// Brute Force Method
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] newarray = new int[2];
//         for(int i=0; i<nums.length-1;i++)
//         {
            // for(int j=i+1; j<nums.length; j++)
//             {
//                 if( nums[i]+nums[j] == target )
//                 {
//                     newarray[0] = i;
//                     newarray[1] = j;
//                 }
//             }
//         }
//         return newarray;
//     }
// }

// hashMap method two pass
// class Solution{
//     public int[] twoSum(int[] nums, int target)
//     {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i<nums.length; i++)
//         {
//             map.put(nums[i], i);
//         }
//         for(int i=0; i<nums.length; i++)
//         {
//             int complement = target - nums[i];
//             if(map.containsKey(complement) && map.get(complement) != i)
//             {
//                 return new int[] {i,map.get(complement)};
//             }
//         }
//         return new int[] {};
//     }
// }

// hashmap one pass
class Solution{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}