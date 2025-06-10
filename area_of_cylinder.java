//Write a program to calculate the volume of a cylinder. 
import java.util.*;
public class solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter rad in cm");
int radius=sc.nextInt();
System.out.print("enter height in cm");
int height=sc.nextInt();
int volume=(22/7)*radius*radius*height;
System.out.print(volume);
}
 