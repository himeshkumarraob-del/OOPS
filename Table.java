import java.util.Scanner;

public class Table {
public static void main(String args[]){
Scanner obj = new Scanner (System.in);

System.out.println("Enter a number: ");
int num = obj.nextInt();

System.out.print("Table: " + num + ":");
for (int i=1;i<=10;i++){
System.out.println(num + " x " + i + "=" + (num*i));
}
obj.close();
}
}