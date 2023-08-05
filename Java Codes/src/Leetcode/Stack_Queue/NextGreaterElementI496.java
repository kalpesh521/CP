package Leetcode.Stack_Queue;
//
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // map for next greater element
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) { // Pop elements from stack and update map with next greater element
                map.put(stack.pop(), num);
            }
            stack.push(num); // Push current element onto stack
        }
        for (int i = 0; i < nums1.length; i++) { // Check if each element in nums1 has a next greater element in map
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1; // Update element in nums1 with next greater element or -1
        }
        return nums1;
    }

    public static void main(String[] args) {
        int [] nums1 ={4,1,2};
        int [] nums2 = {1,3,4,2};
        int [] res = nextGreaterElement(nums1,nums2);
        for (int x :res){
            System.out.print(x+" ");
        }
    }
}

