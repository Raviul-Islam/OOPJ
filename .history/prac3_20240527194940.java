package college;
import java.util.concurrent.atomic.AtomicLong;
class Abs
{
static final AtomicLong Next_ID = new AtomicLong(0);
final long id=Next_ID.getAndIncrement();
public long getId()
{
return id;
}
} class coun{
public static int count;
Abs a=new Abs();
public coun()
{
count++;
a.getId();
}
public void finalize()
{
System.out.println("Object is destroyed ");
System.out.println("ID of destroyed object : " +a.getId());
}
}
public class prac3 {
public static void main(String[] args) {
    coun a=new coun();
coun b=new coun();
coun c=new coun();
coun d=new coun();
coun e=new coun();
System.out.println("Total no of object : "+coun.count);
a=null;
b=null;
c=null;
System.gc();
}
}