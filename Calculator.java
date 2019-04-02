class A
{
	void sum()
	{
	int a=6,b=4,add;
	add=a+b;
	System.out.println("Sum is="+add);
	}
}
class S
{
void sub()
	{
	int a=6,b=4,c;
	c=a-b;
	System.out.println("Sub is="+c);
	}
}
class M
{
void mult()
	{
	int a=6,b=4,pro;
	pro=a*b;
	System.out.println("Multiplication is="+pro);
	}
}
class D
{
void div()
	{
	int a=6,b=4;float divi;
	divi=a/b;
	System.out.println("Division is="+divi);
	}
}
class Calculator
{	public static void main(String s[])
	{
	A ob=new A();
	ob.sum();
	S ob1=new S();
	ob1.sub();
	M ob2= new M();
	ob2.mult();
	D ob3=new D();
	ob3.div();
}
}


