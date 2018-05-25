package stringToAsciiString;
import java.io.IOException;
import java.util.*;
public class main_{
	public static Scanner getTextInput=new Scanner(System.in);
	public static void main(String[] argv) throws IOException{
		//System.out.print("Enter a string to be converted to ASCII text: ");
		//	String textToConvert=getTextInput.nextLine();
		//System.out.println(stringToAsciiString.convertTextToAsCII(textToConvert));
		//System.out.print("Enter a file to read and convert to ASCII");
		System.out.println("Welcome to the x.txt to ASCII y.txt conversion program (No spaces in filepath or filename are allowed): ");
		System.out.print("Enter an entire X.txt (text) filepath and filename (with extension) to read (or drag a .txt file in): ");
			String fileRead=getTextInput.nextLine();//ex:"	C:\\Users\\Nick\\Desktop\\ASCII_To_Text\\_read.txt 	||	C:\Users\Nick\Desktop\ASCII_To_Text\_read.txt	"
		System.out.print("Enter an entire Y.txt (text) filepath and filename (with extension) to write to (in ASCII) (This file doesn't need to exist yet.) (or drag a .txt file in): ");
			String fileWrite=getTextInput.nextLine();//ex:"	C:\\Users\\Nick\\Desktop\\ASCII_To_Text\\_write.txt	||	C:\Users\Nick\Desktop\ASCII_To_Text\_write.txt	"
		fileIO.readWriteFileTextToASCII(fileRead,fileWrite);//readWriteFileTextToASCII;
//		System.out.print("Enter a string to erase: ");
//			String test=getTextInput.nextLine();
//			System.out.println(stringToAsciiString.eraseStringMember(test,0,1));
	}
}