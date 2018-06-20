import java.io.*;
public class filetransfer
{
public static void main(String args[])throws IOException{
File f=new File("C:\\Users\\User\\Desktop\\acadview\\assignment9\\a.txt");
File f2=new File("C:\\Users\\User\\Desktop\\acadview\\assignment9\\b.txt");
FileInputStream fin =new FileInputStream(f);
FileOutputStream fout= new FileOutputStream(f2);
try
{
	int c;
	while((c=fin.read())!=-1){
		fout.write((char)c);
	}
}
catch(FileNotFoundException ex)
	{
		System.out.println("error");
		
	}
	finally
	{
		fin.close();
		fout.close();
	}
}
}