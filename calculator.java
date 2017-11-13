import java.io.*;
import java.util.*;
public class calculator
{
public static void main(String[] args) 
{
int a,b,ch;
Scanner s=new Scanner(System.in);
addition add=new addition();
subtraction sub=new subtraction();
division div=new division();
multiplication mul=new multiplication();
System.out.println("Enter an option:\n 1.Addition \n2.Subtraction\n3.Division\n4.Multiplication");
int c=s.nextInt();
System.out.println("Enter first value:\n");
a=s.nextInt();
System.out.println("Enter Second value:\n");
b=s.nextInt();
if(c==1)
add.add(a,b);
else if(c==2)
sub.sub(a,b);
else if(c==3)
div.div(a,b);
else if(c==4)
mul.mul(a,b);
else
System.out.println("Enter correct option");
}
}