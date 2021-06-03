package abcmart;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoesData sd = new ShoesData();
		
		System.out.println("-------------------------");
		System.out.println("     1. 상품 정보 추가");
		System.out.println("     2. 상품 정보 조회");
		System.out.println("     3. 상품 정보 수정");
		System.out.println("     4. 매출 정보 조회");
		System.out.println("-------------------------");
		
		int select = scan.nextInt();
		
		switch(select) {
			case 1: //상품 정보 추가
				//sd.input();
				break;
			case 2: //상품 정보 조회
				
			case 3: //상품 정보 수정
			
			case 4: //매출 정보 조회
			
			default: 			
		}
	}
}
