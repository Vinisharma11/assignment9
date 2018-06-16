import java.io.*;
public class output
{
public static void main(String []args)throws IOException
{
FileInputStream f= null;
int i=0;
char c;
try
{
f= new FileInputStream("C:\\Users\\User\\Desktop\\acadview\\assignment9\\file.txt");
while((i=f.read())!=-1)
{
c=(char)i;
System.out.print(c);
}
}
catch(FileNotFoundException ex){}
finally{
if(f!=null)
f.close();
}
}
}