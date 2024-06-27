 package practice;

public class Assignment32 {
	 
	int uCount=0;
	int lCount=0;
	int dCount=0;
	
	int getUpperCase(String str){
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			uCount++;
		}
		return uCount;
	}

	int getLowerCase(String str){
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			lCount++;
		}
		return lCount;
	}
	
	int getDigitCase(String str){
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			dCount++;
		}
		return dCount;
	}
	
	String getProcessedData(String str){
		String output="";
		int	uCount=getUpperCase(str);
		int lCount=getLowerCase(str);
		int dCount=getDigitCase(str);
		
		if(dCount > uCount && dCount>lCount){
			//System.out.println("techno");
			return"techno";
		}else if(uCount>lCount && uCount>dCount) {
			//System.out.println("credits");
			return "credits";
		}else if(lCount>uCount && lCount>dCount){
			//System.out.println("pune");
			return "pune";
		}else if(dCount== uCount && dCount==lCount){
			//System.out.println("india");
			return "india";
		}
		return "output";
	}

	public static void main(String[] args){
	Assignment32 assignment32=new Assignment32();
	String output=assignment32.getProcessedData("Sh1iv2aYogi2323232145");
	System.out.println(output);
	output=assignment32.getProcessedData("MAUliK12");
	System.out.println(output);
	output=assignment32.getProcessedData("technocreDits");
	System.out.println(output);
	output=assignment32.getProcessedData(" M1AU2li3k");
	System.out.println(output);
    }
}
