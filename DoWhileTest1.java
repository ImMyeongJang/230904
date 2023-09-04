package day04;
import java.util.*;
public class DoWhileTest1 {

	public static void main(String[] args) {
		/*변수 선언 및 초기화식;
		 * do{
		 * 		실행문;
		 * 		증감식
		 * }while(조건식);
		 * 
		 * 
		 	while문의 경우 조건문이 true일 경우에 반복 실행하지만,
		 *  do ~while문의 경우 조건문이 false일지라도 한번은 실행을 하고
		 * 루프문을 벗어난다. 조건문이 true라면 반복 실행.
		 * */
		int i=50;
		do {
			System.out.println("Hello Java"+i);
			i++;
			
		}while(i<10);
		System.out.println("The End");
		
		
		Scanner sc=new Scanner(System.in);
		int menu=0;
		do {
			System.out.println("------------");
			System.out.println("1시작 2종료");
			System.out.println("------------");
			menu=sc.nextInt();
			if(menu==1) {
				System.out.println("게임게임<<");
			}else if(menu<1||menu>2) {
				System.out.println("오류 다시입력");
			}
		}while(menu!=2);
		System.out.println("The End2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
