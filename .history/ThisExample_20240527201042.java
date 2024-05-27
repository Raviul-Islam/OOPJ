
class Test{
int sum;
Test() // first constructor
{
// calling the second constructor
this(5, 2);
}
Test(int arg1, int arg2) // second constructor
{ // add two value
this.sum = arg1 + arg2;
}
void display() {
System.out.println("Sum is: " + sum);
}
}
public class ThisExample // main class
{
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
// call the first constructor
Test obj = new Test();
// call display method
obj.display();
}
}