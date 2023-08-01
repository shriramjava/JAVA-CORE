package pack1;

public class ReturnMeth {
	public int meth1(int a)
	{
		System.out.println("hi");
		return 100+a;
	}
	public void meth2()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		ReturnMeth obj=new ReturnMeth();
		int result2=obj.meth1(50);
		System.out.println(result2);
		obj.meth2();
		int result=obj.meth1(100);
		System.out.println(result);
	}

}
