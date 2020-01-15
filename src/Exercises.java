public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		// write your code here

		if (a[a.length] == b[b.length] || a[0] == b[0]) {
			return true;
		}
		return false;
	}
	
	public String[] endsMeet(String[] values, int n) {
		// write your code here 
//		if (n < 1 || values.length < n) {			//might have to make it n < 0
//			return null
//		}
//		
//		String[] newArray = [n*2];
//		int currentSize = 0;
//		
//		for (int i = 0; i < n; i++) {
//			newArray[i] = (values[i]);
//			currentSize++;
//		}
//		for (int i = values.length-1; i >= values.length-n; i--) {
//			newArray[i] = (values[i]);
//		}
//		
		return null;	// default return value to ensure compilation
	}
	
	public int difference(int[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
