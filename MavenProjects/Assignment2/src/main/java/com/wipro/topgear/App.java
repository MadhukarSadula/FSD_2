package com.wipro.topgear;
import java.lang.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String s="This is madhukar sadula Writing maven project";
    	App obj=new App();
    	int words=obj.details(s);
        System.out.println( "Hello World!" );
    }
    public int details(String s)
    {
    	System.out.println("String:"+s);
    	System.out.println("string length:"+s.length());
        String[] sarr=s.split(" ");
    	System.out.println("Words in the string:"+sarr.length);
    	System.out.println("string To Upper:"+s.toUpperCase());
    	
    	return sarr.length;
    		
    }
}
