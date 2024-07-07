public class App {

	public int sumaInt(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		App a = new App();
		System.out.println(a.sumaInt(10, 5));
	}
}