package com.operator;

public class OperatorExample {
	public static void main(String args[]) {
		System.out.println("====Java Unary Operator Example 2: ++ and --====");
		int x = 10;
		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10

		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21
		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21
		System.out.println("=========Java Unary Operator Example: ~ and !======");
		int a1=10;  
		int b1=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a1);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b1);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  

		System.out.println("====Java Arithmetic Operator Example=====");
		int a11=10;  
		int b11=5;  
		System.out.println(a11+b11);//15  
		System.out.println(a11-b11);//5  
		System.out.println(a11*b11);//50  
		System.out.println(a11/b11);//2  
		System.out.println(a11%b11);//0  

		System.out.println("====Java Arithmetic Operator Example: Expression====");
		System.out.println(10*10/5+3-1*4/2);  
		System.out.println("====Java Left Shift Operator=====");

		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  

		System.out.println("===Java Right Shift Operator Example===");
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  

		System.out.println("===Java Shift Operator Example: >> vs >>>===");

		//For positive number, >> and >>> works same  
		System.out.println(20>>2);  
		System.out.println(20>>>2);  
		//For negative number, >>> changes parity bit (MSB) to 0  
		System.out.println(-20>>2);  
		System.out.println(-20>>>2);  
		System.out.println(-1>>>29);
		System.out.println(-10>>>1);
		System.out.println("=====Logical && and Bitwise &=====");
		int a111=10;  
		int b111=5;  
		int c1=20;
		System.out.println(a111<b111&&a111<c1);//false && true = false  
		System.out.println(a111<b111&a111<c1);//false & true = false  

		System.out.println("=== Logical && vs Bitwise &===");
		System.out.println(a111<b111&&a++<c1);//false && true = false  
		System.out.println(a111);//10 because second condition is not checked  
		System.out.println(a111<b111 & a++ <c1);//false && true = false  
		System.out.println(a111);//11 because second condition is checked  

		System.out.println("=== Logical || and Bitwise | ===");
		System.out.println(a111>b111||a<c1);//true || true = true  
		System.out.println(a111>b111|a<c1);//true | true = true  
		//|| vs |  
		System.out.println(a111>b111||a++<c1);//true || true = true  
		System.out.println(a111);//10 because second condition is not checked  
		System.out.println(a111>b|a111++<c1);//true | true = true  
		System.out.println(a111);//11 because second condition is checked  

		System.out.println("===Java Ternary Operator Example===");
		int min=(a<b)?a:b;  
		System.out.println(min);  

		System.out.println("=====Java Assignment Operator Example====");
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b); 
  

	}
}