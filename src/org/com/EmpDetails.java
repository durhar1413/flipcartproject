package org.com;

public class EmpDetails {
	public static void main(String[] args) {
	String s1 = "Python";
		System.out.println("code of s1 : "+ System.identityHashCode(s1));
	String s2 =  "Java";
		System.out.println("code of s2 : "+ System.identityHashCode(s2));
	String s3 = "program";
		System.out.println("code of s1 : "+ System.identityHashCode(s3));
		
		
	//immutable	
	String s4=s1.concat(s3);	
		System.out.println(s4);
		
		System.out.println("code of s4 : "+ System.identityHashCode(s4) );
		
		s1 = "bjb";
	System.out.println("code of s1 : "+System.identityHashCode(s1));
		
		
		
		
		
	}

}
