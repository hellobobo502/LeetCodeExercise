package questions;

import java.util.Arrays;

/**
 * 88.Merge Sorted Array
 */
public class Q88 {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int len1 = m-1, len2 = n-1;
		int allLen = m+n-1;
		
		while(len1 >= 0 && len2 >= 0) {
			if(nums1[len1] > nums2[len2]) {
				nums1[allLen--] = nums1[len1--];
			}else {
				nums1[allLen--] = nums2[len2--];
			}
		}
		
		while(len2 >= 0) {
			nums1[allLen--] = nums2[len2--];
		}
    }
}