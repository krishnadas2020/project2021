package abstract_exercise;

public class Cat extends Animals implements Pet{
	String name;
	public Cat(String n) {
		super(4);
		name =n;
		System.out.println("cat has four legs");
	}
	public Cat() {
		this("junny");
		}
	public void play() {
		System.out.println("cat can play");
		
	}
	public void eat() {
		System.out.println("cat eat fish ");
	}
	

}
