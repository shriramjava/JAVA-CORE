package pack1;

public class FirstD {
	public void Meth1()
	{
		System.out.println("hello shriram");
	    FirstD obj1=new FirstD();
	    obj1.Meth2();
	}
	public void Meth2()
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		FirstD obj1=new FirstD();
		obj1.Meth1();
		obj1.Meth2();
		System.out.println("to first java program");
	}

}
