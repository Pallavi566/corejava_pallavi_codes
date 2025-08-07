package Variable;

public class variable {

		int a=10;//instance variable
		
		void print()
		{
			String msg="hello";//local variable
			System.out.println(msg);
		}
		
		static String message="hello students";
		
		public static void main(String[] args) {
			 variable obj = new  variable();
			 System.out.println("the value of a " +obj.a);
			 obj.print();
			 System.out.println(message);
	}

}
