package inheritance;

public class ClassB extends ClassA {

	
	public void finalmodifier(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	public static void main(String[] args) {
		ClassB kk=new ClassB();
		kk.finalmodifier(50, 60, 70);
		
		
	}
}
