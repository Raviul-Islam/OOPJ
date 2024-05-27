import java.util.Scanner;
class Employee {
String name;
String dept;
int age;
int sal;
}
public class FirstProgram {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter How many employee:");
int k = sc.nextInt();
Employee emp[] = new Employee[k];
for (int i = 0; i < k; i++) {
emp[i] = new Employee();
System.out.println("Enter " + (i + 1) + " Employee data :");
System.out.print("Enter employee name :");
emp[i].name = sc.next();
System.out.print("Enter employee Department:");
emp[i].dept = sc.next();
System.out.print("Enter employee age:");
emp[i].age = sc.nextInt();
System.out.print("Enter employee salary:");
emp[i].sal = sc.nextInt();
}
System.out.println("\n\n============ All employee details are :============\n");
for (int i = 0; i < k; i++) {
System.out.println("Employee name Department age and salary :" + emp[i].name+ " " +
emp[i].dept + " " + emp[i].age +" "+ emp[i].sal);
}
}
}