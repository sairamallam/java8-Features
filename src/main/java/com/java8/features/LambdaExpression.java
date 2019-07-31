package com.java8.features;

@FunctionalInterface
interface Drawable {
	public void draw();

}

@FunctionalInterface
interface Drawable2 {
	public String drawReturn();

}


@FunctionalInterface
interface Drawable3 {
	public String drawReturn(String username,String password);

}

public class LambdaExpression {

	static Drawable  d = () -> System.out.println("hi draw lambada expression");

	public  void lambdaSmaple(String args[]) {
		
		// Lambda expression single statement
		d.draw();

		// Lambda expression return type 
		Drawable2 d2 = () -> {
			return "hi drawReturn lambada expression";
		};
		String value = d2.drawReturn();
		System.out.println("return value= " + value);
		
		Drawable3 d3 = (username,pssword) -> {
			return "username= "+username+"  pssword="+pssword;
		};
		
		String value2 = d3.drawReturn("sai", "ram");
		System.out.println("return parameter value= " + value2);
		
		
		// Lambda expression with parameters
		
	}
	
	
	public static void main(String[] args) {
		
		LambdaExpression le=new LambdaExpression();
		le.d.draw();
		
	
	}
	
	
	
	

}
