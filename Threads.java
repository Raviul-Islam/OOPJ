class numbers extends Thread{
public void run(){
for(int i=1;i<=10;i++){
System.out.println(" "+i);
}
}
} class alphabets extends Thread{
public void run(){
for(char i='A';i<='J';i++){
System.out.println(" "+i);
}
}
}
public class Threads {
public static void main(String[] args){
numbers r=new numbers();
alphabets a=new alphabets();
Thread t1=new Thread(r);
Thread t2=new Thread(a);
t1.start();
t2.start();
try{
t2.join();
} catch (InterruptedException ex) {
}
}
}