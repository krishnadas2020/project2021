package abstract_interface;

public  class Car extends Vehicle {
	public void run() {
		System.out.println("i have car");
		
	}
	public static void main(String[]args) {
		Car c= new Car();
		c.run();
	}

}
