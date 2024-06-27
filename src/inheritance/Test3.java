package inheritance;

public class Test3 {
	public static void main(String[] args) {
		Parent p1 =new Child();
		System.out.println(p1.x);
		System.out.println(p1.y);
		//System.out.println(p1.z);//reference type not taking the gurrantee of z variable so it is not print
		
		p1.m1();
		p1.m2();
		//p1.m3();//reference type not taking the guarrante of m3 method so m3 is not printing
	}
}
