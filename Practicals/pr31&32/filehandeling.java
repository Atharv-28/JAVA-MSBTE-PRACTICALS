import java.io.*;
class filehandeling
{
public static void main(String args[])
{
FileOutputStream op=null;
try
{
String str="atharva beglum don";
byte[] b=str.getBytes();
File f=new File("D:/Coding/JAVA/test.txt");
if(!f.exists())
{
f.createNewFile();
}
op=new FileOutputStream(f);
op.write(b);
op.flush();
op.close();
}
catch(IOException e)
{
System.out.println(e);
}

}
}