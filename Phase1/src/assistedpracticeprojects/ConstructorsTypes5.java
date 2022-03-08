package assistedpracticeprojects;

public class ConstructorsTypes5 {

	
		int id;
		String name;
		ConstructorsTypes5(){
			int id;
			String name;
			}
		void display() {
			System.out.println(id+" "+name);
			}
		ConstructorsTypes5(int i,String n)
		{
		id=i;
		name=n;
		}
		public static void main(String[] args){
			ConstructorsTypes5 a=new ConstructorsTypes5();
			ConstructorsTypes5 b=new ConstructorsTypes5();
			a.display();
			b.display();
			ConstructorsTypes5 c=new ConstructorsTypes5(1,"rahul");
			ConstructorsTypes5 d=new ConstructorsTypes5(2,"gita");
			c.display();
			d.display();
		}
	}
	
