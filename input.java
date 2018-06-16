import java.io.*;
class input
{
	public static void main(String[] args)throws IOException
	{
		FileOutputStream f= null;
		String s= "C:/Users/User/Desktop/acadview  C:/Users/User/Desktop/acadview/assignment5  C:/Users/User/Desktop/acadview/assignment8";
		           
		byte buf[]=s.getBytes();
		try
		{
			f=new FileOutputStream("C:\\Users\\User\\Desktop\\acadview\\assignment9\\file.txt");
			for(int i=0;i<buf.length;i++)
			{
				f.write(buf[i]);
			}
			
		}
		catch(FileNotFoundException e){}
		finally
		{
			f.close();
		}
	}
}