package com.java;

import java.util.stream.Stream;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hello world \nwelcome to java");
		String str1=new String("    Hello World    ");
		Stream<String> stream=str1.lines();
		stream.filter((line)->{return !line.isBlank();})
		.map((line)->{return line.strip();})
		//.map(String::strip)
		.forEach(System.out::println);
		Stream stream2=Stream.of(str);
		stream2.forEach((var  s1)->{System.out.println(s1);});

	}

}
