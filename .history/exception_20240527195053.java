import java.io.*;
class NewException extends Exception{
int x;
NewException(int y) {
x=y;
}
public String toString(){
return ("Exception value = "+x) ;
}
} class UncheckedExceptionExample1
{ UncheckedExceptionExample1(){
int postive = 35;
int zero = 0;
int result = postive/zero;
System.out.println(result); }
}
class CheckedExceptionExample{
CheckedExceptionExample() throws FileNotFoundException, IOException
{
FileReader r=new FileReader("C:\\xampp\\htdocs\\php_files\\java.txt");
int i;
while((i=r.read())!=-1)
{System.out.println((char)i);}
}
}
public class exception {
public static void main(String[] args) throws IOException {
try{
throw new NewException(5);
} catch(NewException ex){
System.out.println(ex) ;
}
CheckedExceptionExample ce=new CheckedExceptionExample();
UncheckedExceptionExample1 ue=new UncheckedExceptionExample1();
}
}