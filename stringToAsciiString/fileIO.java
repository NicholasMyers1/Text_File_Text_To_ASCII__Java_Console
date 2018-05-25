package stringToAsciiString;
import java.io.*;
//https://www.tutorialspoint.com/java/java_files_io.htm
//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
public class fileIO{
	public static String read(String fileRead) throws IOException{
		String lineData="",returnData="";
		BufferedReader readFileBuffer=new BufferedReader(new FileReader(fileRead));
			while((lineData=readFileBuffer.readLine())!=null){
				returnData+=lineData+"\n";
			}
		readFileBuffer.close();
		return returnData;
	}
	public static void write(String fileWrite,String data) throws IOException{
		BufferedWriter writeFileBuffer=new BufferedWriter(new FileWriter(fileWrite));
		writeFileBuffer.write(data);
		writeFileBuffer.close();
	}
	public static void readWriteFileTextToASCII(String fileRead,String fileWrite) throws IOException{
		String lineData="";
		BufferedReader readFileBuffer	=new BufferedReader(new FileReader(fileRead));
		BufferedWriter writeFileBuffer	=new BufferedWriter(new FileWriter(fileWrite));
			while((lineData=readFileBuffer.readLine())!=null){
				writeFileBuffer.write(stringToAsciiString.convertTextToAsCII(lineData)+"\n");
			}
		readFileBuffer.close();
		writeFileBuffer.close();
	}
}