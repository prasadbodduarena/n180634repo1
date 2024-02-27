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
       System.out.println( new App().Arithmetic(12, 32));
       System.out.println(new App().newMessage("I love GitHUB"));
               
    }
    public int Arithmetic(int x,int y) {
    	return x+y;
    }
    public String newMessage(String msg) {
    	return msg;
    }
}
