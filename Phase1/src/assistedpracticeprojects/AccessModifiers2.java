package assistedpracticeprojects;

public class AccessModifiers2 {
        
	void display1() { 
	       System.out.println("This is defalut access modifier"); 
	   } 
	private void display2() 
	  { 
	      System.out.println("This is private access modifier"); 
	  }
	protected void display3() 
	  { 
	      System.out.println("This is protected access modifier"); 
	  } 
	public void display4() 
	  { 
	      System.out.println("This is Public Access modifiers"); 
	  } 
	public static void main(String[] args) {
	AccessModifiers2 obj = new AccessModifiers2(); 		  
obj.display1(); 
obj.display2();
obj.display3();
obj.display4();
}
}
	
	

