package practice;

public class P2 {
	
	String getProcessed(String str) {
		String out="",out1="",out2="",out3="";
		for(int in=0;in<str.length();in++) {		
			char ch = str.charAt(in);
			if(Character.isUpperCase(ch)) {
				out1= out1+ch;
			}else if(Character.isLowerCase(ch)) {
				out2=out2+ch;
			}else if(Character.isDigit(ch)){
				out3=out3+ch;
			}
		}
		return out=out1+out2+out3;
	}
	
	public static void main(String[] args) {
		P2 p2= new P2();
		String out= p2.getProcessed("tEChn1oCreDIT7s3");
		System.out.println(out);
	}
}

