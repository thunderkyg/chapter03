package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		Point p03 = p00;
		
		//getClass():클래스 정보
		System.out.println("=getCalss()===================");
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("==============================");
		
		//hashCode():주소->주소에대응되는 값
		System.out.println("=hashCode()===================");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("==============================");
		
		//toString():객체의 정보
		System.out.println("=hashCode()===================");
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("==============================");
		
		//equals():객체가 같은지 비교
		System.out.println("=equals()===================");
		System.out.println(p01.equals(p02));
		System.out.println(p00.equals(p01));
		System.out.println(p00 == p01);
		System.out.println(p01 == p02);
		System.out.println(p00 == p03);
		
	}

}