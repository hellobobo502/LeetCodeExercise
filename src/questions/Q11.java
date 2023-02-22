package questions;

/**
 * 11.Container With Most Water
 */
public class Q11 {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
		int x = 0, y = height.length-1, maxArea = 0;
		while(x < y) {
			int h = Math.min(height[x], height[y]);
			maxArea = Math.max(maxArea, (y-x)*h);
			
			if(height[x] > height[y]) {
				y--;
			}else if(height[x] < height[y]) {
				x++;
			}else {
				x++;
				y--;
			}
		}
		return maxArea;
    }
}
