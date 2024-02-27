package com.nit.service;

/**
 * Hello world!
 *
 */
public class App 
{   static  App app=new App();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(app.WishMessage("Love ","My india"));
        System.out.println(app.Arithmetic(34, 433, false));
        System.out.println(app.LogicalOp(43, 343) );
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
   public int LogicalOp(int x,int y) {
	   if(x!=0)
	return x;
	   else
    return y;//9797696

		  
   }
}
