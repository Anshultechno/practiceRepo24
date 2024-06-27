package practice;

public class P3 {
	int count=0;
	String getReverseString(String str) {
		String out="";
		for(int in=str.length()-1;in>0;in--) {
			char ch = str.charAt(in);
			out=out+ch;
		}
		//System.out.println(out);
		return out;
	}
	String getStringExcluding(String str) {
		String out = "";
		for(int in=0;in<str.length();in++) {
		    
			char ch = str.charAt(in);
			if(!Character.isDigit(ch)) {
				out=out+ch;
			}	
		}
		//System.out.println(out);
		return out;
	}
	
	String getProccessedInput(String input) {
		input= getReverseString(input);
		System.out.println(input);
		input= getStringExcluding(input);
		return input;
	}
	public static void main(String[] args) {
		P3 p3 = new P3();
		String input="t1e3chn9o";
		String output=p3.getProccessedInput(input);
		System.out.println(input+"."+output);
		
		
	}
}
