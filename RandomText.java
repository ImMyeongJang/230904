package day04;
import java.util.*;
public class RandomText {
//	랜덤한 값 추출하는 방법
//	1)java.lang.math클래스의 random()메서드 이용하는 방법
//		public static double random();
//		0.0<= r <1.0 사이의 임의의 랜덤한 실수값으 반환하는 메서드
//	2)java.util.Random클래스의 nextInt(), nextFloat(), nextDouble()...이용하는방법
//		public double nextDouble()
//		public int nextInt()

	public static void main(String[] args) {
		double r = Math.random();
		System.out.println("r="+r);
		
		//Math.random()을 이용해서
//		[문제1] 0<= v2 <10 사이의 임의의 정수를 발생시키세요.
	
		int v2=(int)(Math.random()*10);
		System.out.println(v2);
		
		
//		[문제2] 5<= v3 <15 사이의 임의의 정수를 발생시키세요.
		int v3=(int)(Math.random()*10)+5;
		System.out.println(v3);
		
//		23<= V4 < 77 사이의 임의의 정수 출력하기
		int v4=(int)(Math.random()*54)+23;
		System.out.println(v4);
		
		
		Random ran=new Random();//ran = 랜덤객체를 참조하는 인스턴스 변수
		double v5=ran.nextDouble();
		System.out.println(v5);
		
		int v6=ran.nextInt();
		System.out.println(v6);
		
		//0<v7 < 10
		//int r=ran.nextInt(범위);+시작수
		int v7=ran.nextInt(10);
		System.out.println(v7);
		
		//23<= v8 <77
		int v8=ran.nextInt(54)+23;
		System.out.println(v8);
		
		
		//랜덤 알파벳 대문자 아래와같이 출력
		char a=65;
		char z=91;
		
		System.out.println(a+""+z);
		
		
		
		
		
	
	}

}
