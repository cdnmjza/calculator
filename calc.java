
public class calc {
	public int add(int a, int b) {
		return a + b;
		}
	public int subtract(int a, int b) {
		return a - b;
		}
	public int multiply(int a, int b) {
		return a * b;
		}
	public int divide(int a, int b) {
		return a / b;
		}

	public static void main(String[] args) {
		calc myCalculator = new calc();
		System.out.println(myCalculator.add(4,2));
		System.out.println(myCalculator.subtract(7,5));
		System.out.println(myCalculator.multiply(8,4));
		System.out.println(myCalculator.divide(35,5));
	}
}
