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
System.out.println("Enter an option:\n 1.Addition \n2.Subtraction\n");
int c=s.nextInt();
System.out.println("Enter first value:\n");
a=s.nextInt();
System.out.println("Enter Second value:\n");
b=s.nextInt();
if(c==1)
add.add(a,b);
else if(c==2)
sub.sub(a,b);
else
System.out.println("Enter correct option");
}
}