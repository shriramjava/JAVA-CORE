package pack1;

public class Parameth {
	public void meth1()
	{
		System.out.println("meth1() called");
	}
	public static void main(String[] args) {
		Parameth obj=new Parameth();
		obj.meth1();   //case 1
		new Parameth().meth1(); //case2 
		
	}

}
