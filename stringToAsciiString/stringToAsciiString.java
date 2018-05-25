package stringToAsciiString;
public class stringToAsciiString{
	public static String convertTextToAsCII(String convert){
		String ASCIIString="";
		int ASCIIInt=0;
		for(int n=0;n<convert.length();n++){
			ASCIIInt=(int)convert.charAt(n);
			ASCIIString+=Integer.toString(ASCIIInt);
			if(n!=convert.length()-1)ASCIIString+=" ";
		}
		return ASCIIString;
	}
/*	public static String eraseStringMember(String string_, int posToErase){				return(eraseString(string_,posToErase,	posToErase,	0));}//erase at a specific position in the string range;
	public static String eraseStringMember(String string_, int posStart, int posStop){	return(eraseString(string_,posStart,	posStop,	1));}//erase from a specific position in the string to another specific position in the string (in range);
		private static final String eraseString(String inputString, int posToEraseOrStart, int posStop, int functionType){
			String stringReturn="";
				if(posToEraseOrStart<0||posStop<0)return inputString;
			for(int n=0;n<inputString.length();n++){
				if(functionType==0){if(n!=posToEraseOrStart)stringReturn+=inputString.charAt(n);}
				else if(functionType==1){
					if(posToEraseOrStart>=posStop){
						if(n<posToEraseOrStart||n>posStop+posToEraseOrStart-1)stringReturn+=inputString.charAt(n);
					}
					else if(posToEraseOrStart<posStop){
						if(n<posToEraseOrStart||n>posStop-1)stringReturn+=inputString.charAt(n);
					}
				}
			}return stringReturn;
		}*/
}