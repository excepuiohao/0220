package com.test;

import com.java.JavaClassExample;

/**
 * @author excepuio ≤‚ ‘javaclass
 */
public class TestJavaClass {

	public static void main(String[] args) {
		JavaClassExample javaClassExample = new JavaClassExample("Bob", 20);
		javaClassExample.introduceMyself("Steve", 20);
		System.out.println(javaClassExample.getName());
	}
}
