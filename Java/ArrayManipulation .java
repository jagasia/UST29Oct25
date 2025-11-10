import java.util.*;
public class ArrayManipulation {
	public int removeDuplicates(int[] nums) {
		// Your code here
		List<Integer> arr=new ArrayList<>();
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++){
			if(!set.contains(nums[i])){
				arr.add(nums[i]);
				set.add(nums[i]);
			}
		}
		return arr.size();
	}
}