package pack1;

public class MethEx {
	void meth1(int a)
	{
		System.out.println("meth1() is called");
		System.out.println("a value is :"+a);
	}
void meth2(int a,String s)
{
	System.out.println("meth2() is called");
	System.out.println("a value is :"+a);
	System.out.println("s value is :"+s);
}
public static void main(String[] args) {
	MethEx obj=new MethEx();
	//obj.meth1(); //C.E
	obj.meth1(50);
	//obj.meth2("java is awsome",1000)//error due to order of paramete change
    obj.meth2(1000,"hello shriram");
}
}
