package java_programing_topics;
import java.util.*;

public class Datatypes_variables_operators2 {
	public static void main(String[] args) {
		
/* *************  Variables and Data types  *********** */
		
		byte num0 = 127;
		int num = 32768;
		short num1=32767;
		long num2=64141216;
		float num3=70;
		double num4 = 2.3;
		char letter='s';
		String word="hello world";
		boolean words = true;
		
		System.out.println("byte : " + num0);
		System.out.println("int : " + num);
		System.out.println("short : " +num1);
		System.out.println("long : " + num2);
		System.out.println("float : " + num3);
		System.out.println("double : " + num4);
		System.out.println("char : " + letter);
		System.out.println("string : " + word);
		System.out.println("boolean : " + words);
		
/* *********** Type casting ********** */
		
		byte b = 7;
		int i = 8;
		
		// Implicite
		i = b;
		
		// Explicite
		b = (byte)i;
		
/* *********** Operators ********** */	
		
	/* *********** Arithmetic operators (+,-,*,/,%) ************** */
		System.out.println("Arithmetic operators using int -- ");
		
		int a = 11,c=2,d,e;
		d=a/c;
		e=a%c;
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("Arithmetic operators using double -- ");
		
		double f = 11,g = 2,h,j;
		h=f/g;
		j=f%g;
		System.out.println(h);
		System.out.println(j);
		
    /* *********** Assignment operators (+= ,-= ,*= ,/= ,%= ) ************** */		
		System.out.println("Assignment operators -- ");
		f*=g;
		System.out.println(f);
		
	/* *********** Increment/Decrement operators (++ , -- ) ************** */		
		System.out.println("Increment/Decrement -- ");
		int k,l=10;
		k = ++l;
		System.out.println(k);
		k = l++;
		System.out.println(k);
		
	   /* ****Exercise */
		int m=3,n=4,o;
		o=m+n+m++ + n++ + ++m + ++m;
		System.out.println(o);
		
	/* *********** Relational operators (< , <= , > , >= , == , != ) ************** */
		System.out.println("Relational operator -- ");
		System.out.println(m != n);
		
	/* *********** Bitwise operators ( & , | , ^ , ~ ) ************** */
		System.out.println("Bitwise operator --");
		int p,q,r,s;
		p = m & n;
		q = m | n;
		r = m ^ n;
		s = ~m;
		System.out.println("m & n :" + p);
		System.out.println("m | n :" + q);
		System.out.println("m ^ n :" + r);
		System.out.println(" ~m :" + s);
		
	/* *********** Shift operators ( << , >> , >>> ) ************** */
		System.out.println("shift operator -- ");
		int t=4;
		int u = -5;
		System.out.println(t<<2);
		System.out.println(t<<1);
		System.out.println("u>>1" + (u>>1));
		System.out.println("u>>>1" + (u>>>1));

	/* *********** Short circuit operators ( && , || ) ************** */
		System.out.println("Short circuit operator -- ");
		int v = 70;
		System.out.println("Short circuit using And && : " + ((v<60) && (v>50)));
		System.out.println("Short circuit using Or || : " + ((v>60) || (v<65)));
		System.out.println("operation using And & : " + ((v<60) & (v>50)));
		System.out.println("oprration using Or | : " + ((v>60) | (v<65)));
		
		/* *********** Exercise -- Swapping of two numbers (x^y)^ y********** */
		int x = 5 , y = 10 ;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("swap value of x : " + x);
		System.out.println("Swap value of y : " +y);
		
	}	
}
