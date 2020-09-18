package arraylist_example;

import java.util.HashSet;

public class Collection {

	public static void main(String[] args) {
		HashSet<String> name= new HashSet<String>();
		name.add("sani");
		name.add("krishna");
		name.add("arjun");
		name.add("sani");
		//System.out.println(name.size());
		//System.out.println(name.remove("sani"));
		//System.out.println(name.size());
		HashSet<Float> f= new HashSet<Float>();
		      f.add(10.10f);
		      f.add(20.20f);
		      f.add(30.30f);
		      float x=0.0f;
		      for(float a:f) {
		    	  x=x+a;
		      }
		      System.out.println(x);

	}

}
