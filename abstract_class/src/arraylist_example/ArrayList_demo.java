package arraylist_example;


import java.util.ArrayList;
import java.util.List;

public class ArrayList_demo {

	public static void main(String[] args) {
		String a= new String ("A");
		String b= new String ("B");
		String c= new String ("C");
		String d= new String ("D");
		
		List<String> l= new ArrayList<String>();
                   l.add(a);
                   l.add(b);
                   l.add(c);
                   l.add(d);
                   System.out.println(l.size());
                   System.out.println(l.get(2));
                   System.out.println(l.remove(1));
                   System.out.println(l.size());
                   System.out.println(l.get(2));
          String s=new String("D");   
                  l.add(s);
                  System.out.println(l.size());
                  System.out.println(l.get(2));
                  System.out.println(l.get(3));
                  for(int i=0; i<l.size(); i=i+1) {
                	  System.out.println(l.get(i));
                	  
                  }
                  String z =" ";
                  for(String x:l) {
                	 // System.out.println(x);
                	  z=z+" "+x;
                	  
                  }
                  System.out.println(z);
	}

}
