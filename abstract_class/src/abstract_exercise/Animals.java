package abstract_exercise;

public abstract class Animals {
	int leg;
	
	protected Animals(int l) {
		leg=l;
	}
	
	abstract public void eat();
	
	public void walk() {
		System.out.println("animal walk by leg");
		
	}
		
	
	

}
