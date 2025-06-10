//Write a program to calculate the area of a circle. Take the radius as input. 
import java.util.*;
public class solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter rad in cm");
int radius=sc.nextInt();
int area=(22/7)*radius*radius;
System.out.print(area);
}
}