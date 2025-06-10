//Write a program that takes the temperature in Celsius as input and converts
//it to Fahrenheit using the formula:
//Fahrenheit = (Celsius * 9/5) + 32.
 import java.util.*;
public class solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter temp in celcius");
int celcius=sc.nextInt();
int faren=(celcius*(9/5))+32;
System.out.print(faren);
}
}