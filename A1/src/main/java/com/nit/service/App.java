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
        System.out.println(new App().WishMessage("Love ","My india"));;
    }
    public String WishMessage(String msg,String word) {
    	String send=new String(msg);
    	String pin=send.concat(word);
    	return pin;
    }
}
