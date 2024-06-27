package inheritance;

public class Test2 {
	public static void main(String[] args) {
		Child c =new Child();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		
		c.m1();
		c.m2();
		c.m3();
	}
}
