package pack1;

public class ClassB {
   void meth1()
   {
	   int a=10;
	   System.out.println("a value is: "+a);
	   System.out.println(90-a);
	   ClassB bobj=new ClassB();
	   bobj.meth2();
	   System.out.println(1000);
	   }
   void meth2()
   {
	   int a=99;
	   System.out.println("meth2 called");
	   System.out.println("addithion values=>"+(a+1));
	   }
   public static void main(String[] args) {
	System.out.println("hi");
	ClassB bobj=new ClassB(); 
	bobj.meth1();
	   System.out.println("End");

}
}
