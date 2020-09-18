package abstract_exercise;

public class Test_Animals {

	public static void main(String[] args) {
		 Fish d = new Fish();
		 d.eat();
		 d.walk();
		 
		 Cat c = new Cat("Fluffy");
		 c.play();
		 c.walk();
		 
		 Animals a = new Fish(); 
		 a.eat();
		 a.walk();
		 
		 Animals e = new Spider();
		 e.eat();
		 e.walk();
		 
		 Pet p = new Cat();
		 p.play();
		 

	}

}
