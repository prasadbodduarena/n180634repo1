package com.nit.service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(new App().WishMessage("Love ","My india"));
        System.out.println(new App().Arithmetic(34, 433, false));
    }
    public String WishMessage(String msg,String word) {
    	String send=new String(msg);
    	String pin=send.concat(word);
    	return pin;
    }
   boolean Arithmetic(int x,int y,boolean z){
    	int t=x+y;
    	if(t>=122) 
    	 return z;
    	else
    	return z;
    	
    	
    }
}
