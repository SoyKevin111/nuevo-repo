public class App {

	public int RestaInt(int a, int b) {
		return a - b;
	}

	public int SumaInt(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		App a = new App();
		System.out.println(a.RestaInt(10, 5));
		System.out.println(a.SumaInt(10, 6));
	}
}