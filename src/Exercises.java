public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		// write your code here
		if (a[a.length] == b[b.length] || a[0] == b[0]) {
			return true;
		}
	}
	public String endsMeet(String[] a, String[] b) {
		if (a == null || a.length < n || b == null || b.length < n) {
			return false;
		}
	}
}
