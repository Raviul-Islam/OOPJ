import java.io.*;
import java.util.*;
public class FileExample {
public static void main(String[] args) throws FileNotFoundException, IOException {
// PrintWriter object for file3.txt
PrintWriter pw = new PrintWriter("C:\\Users\\RUNGTACLIENT\\Desktop\\T3.txt");
// BufferedReader object for file1.txt
BufferedReader br = new BufferedReader(new
FileReader("C:\\Users\\RUNGTACLIENT\\Desktop\\T1.txt"));
String line = br.readLine();
// loop to copy each line of
// file1.txt to file3.txt
while (line != null)
{
pw.println(line);
line = br.readLine();
}
br = new BufferedReader(new
FileReader("C:\\Users\\RUNGTACLIENT\\Desktop\\T2.txt"));
line = br.readLine();
// loop to copy each line of
// file2.txt to file3.txt
while(line != null)
{
pw.println(line);
line = br.readLine();
}
pw.flush();
// closing resources
br.close();
pw.close();
System.out.println("Merged T1.txt and T2.txt into T3.txt");
}
}