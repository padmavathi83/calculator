import java.io.*;
import java.util.*;
public class calculator
{
public static void main(String[] args) 
{
int a,b;
Scanner s=new Scanner(System.in);
addition add=new addition();
System.out.println("Enter first value:");
a=s.nextInt();
System.out.println("Enter Second value:");
b=s.nextInt();
add.add(a,b);
}
}