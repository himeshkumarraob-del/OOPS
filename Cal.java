import java.util.Scanner;

public class Cal{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);

System.out.println("Enter value of a: ");
double a = obj.nextDouble();

System.out.println("Enter value of b: ");
double b = obj.nextDouble();

System.out.println("Enter operator +,-,%,/,: ");
char operator = obj.next().charAt(0);

double result;

switch(operator){
case '+':
result = a + b;
System.out.print("Sum: " + result);
break;

case '-':
result = a - b;
System.out.println("Result: "+ result);
break;

case '/':
if (b !=0){
result = a/b;
System.out.println("Result: "+ result);
}
else{
System.out.println("Error");
}
break;

default:
System.out.println("Inavalid operator");
}
obj.close();
}
}



