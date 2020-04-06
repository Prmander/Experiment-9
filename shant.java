java.util.Scanner;
import java.lang.*;
class shant 
{
int a;
 int b;
 void setData()
{
 Scanner sc=new Scanner(System.in); 
System.out.print("Enter the value of 2 numbers:\nx:");
 String x= sc.next();
 System.out.print("y:"); 
String y= sc.next(); 
try {
a=Integer.parseInt(x); 
b=Integer.parseInt(y); 
} 

catch(NumberFormatException n) 
{
System.out.println(n); 
System.out.println("Invalid int value!!!"); 
System.out.println();
}}
 void showResult() 
{
try
{
 System.out.println("Division:"+a/b); 
}import
catch(ArithmeticException e)
{
 System.out.println(e); 
System.out.println("Not Divisible by zero");
 System.out.println();
}
}
 static public void main(String args []) 
{
shant ex=new shant(); 
ex. setData(); 
ex. showResult();
}
}



