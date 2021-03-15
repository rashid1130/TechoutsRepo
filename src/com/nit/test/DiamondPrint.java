package com.nit.test;

import java.util.*;  
public class DiamondPrint 
{  
public static void main(String[] args)  
{  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the number of rows you want to print: ");  
int rows = sc.nextInt(); 
int i=0;
int j=0;
int k=0;
for (i=1; i<= rows ; i++) {  
for (j = rows; j > i ; j--)  {  
System.out.print(" ");  
}  
System.out.print("*");  
for (k = 1; k < 2*(i -1) ;k++)   
{   
System.out.print(" ");   
}  
if( i==1)   
{   
System.out.println("");  
}  
else  
{  
System.out.println("*");   
}  
}   
for (i=rows-1; i>= 1 ; i--)  
{  
for (j = rows; j > i ; j--)   
{  
System.out.print(" ");  
}  
System.out.print("*");  
for ( k = 1; k < 2*(i -1) ;k++)   
{  
System.out.print(" ");  
}  
if(i==1)  
System.out.println("");  
else  
System.out.println("*");  
}  
}  
}  



