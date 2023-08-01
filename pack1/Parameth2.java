package pack1;

public class Parameth2 {
	void meth(int a)
	{
		System.out.println(a);
	}
	void meth1(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Parameth2 bobj=new Parameth2();
				bobj.meth(100);
	            bobj.meth1("java is awsome");
	            
	            // new Parameth2().meth(100);
	            //new Parameth2().meth1("java is awsome");
	}
}
