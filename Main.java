/* time : 12:20
 * author : 유승원
 * how : 전체적인 동작을 나타내는 가시적 메인 클래스
 */

package shoesMall;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);

	ShoesData_Casual sd_c = new ShoesData_Casual();
	ShoesData_Sneakers sd_sn = new ShoesData_Sneakers();
	ShoesData_Sports sd_sp = new ShoesData_Sports();
	
	public void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("     1. 상품 정보 추가");
		System.out.println("     2. 상품 정보 조회");
		System.out.println("     3. 상품 정보 수정");
		System.out.println("     Q. 시스템 종료");
		System.out.println("-------------------------");
		
		int select_m = scan.nextInt();
		
		while(true) {
			switch(select_m) {
				case 1: //상품 정보 추가
					shoesInput();
					break;	
				case 2: //상품 정보 조회
					shoesLookup();
					break;
				case 3: //상품 정보 수정
					shoesModordel();
				default:
					System.out.println("번호를 알맞게 입력해주세요.");
			}
		}
	}
	
	/* time : 15:30
	 * author : 유승원
	 * how : 상품 정보 추가 메소드
	 */
	public void shoesInput() {
		System.out.println("상품 정보를 추가합니다.");
		System.out.println("1. 캐주얼화");
		System.out.println("2. 스니커즈");
		System.out.println("3. 운동화");
		
		int select = scan.nextInt();
		
		if(select == 1) {
			sd_c.input();
		} else if(select == 2) {
			sd_sn.input();
		} else if(select == 3) {
			sd_sp.input();
		}
	}
	
	/* time : 15:40
	 * author : 유승원
	 * how : 상품 정보 조회 메소드
	 */
	public void shoesLookup() {
		System.out.println("상품 정보를 조회합니다.");
		System.out.println("1. 캐주얼화");
		System.out.println("2. 스니커즈");
		System.out.println("3. 운동화");
		
		int select = scan.nextInt();
		
		if(select == 1) {
			sd_c.lookup();
		} else if(select == 2) {
			sd_sn.lookup();
		} else if(select == 3) {
			sd_sp.lookup();
		}
	}
	
	/* time : 15:45
	 * author : 유승원
	 * how : 상품 정보 수정 및 삭제 메소드
	 */
	public void shoesModordel() {
		System.out.println("상품 정보를 조회합니다.");
		System.out.println("1. 캐주얼화");
		System.out.println("2. 스니커즈");
		System.out.println("3. 운동화");
		
		int select = scan.nextInt();
		
		if(select == 1) {
			int select2 = scan.nextInt();
			
			System.out.println("1. 상품 수정");
			System.out.println("2. 상품 삭제");
			
			if(select2 == 1) {
				sd_c.modify();
			} else if(select2 == 2) {
				sd_c.delete();
			} else {
				System.out.println("번호를 알맞게 입력해주세요.");
			}
			
		} else if(select == 2) {
			int select2 = scan.nextInt();
			
			System.out.println("1. 상품 수정");
			System.out.println("2. 상품 삭제");
			
			if(select2 == 1) {
				sd_sn.modify();
			} else if(select2 == 2) {
				sd_sn.delete();
			} else {
				System.out.println("번호를 알맞게 입력해주세요.");
			}
			
		} else if(select == 3) {
			int select2 = scan.nextInt();
			
			System.out.println("1. 상품 수정");
			System.out.println("2. 상품 삭제");
			
			if(select2 == 1) {
				sd_sp.modify();
			} else if(select2 == 2) {
				sd_sp.delete();
			} else {
				System.out.println("번호를 알맞게 입력해주세요.");
			}
		} else {
			System.out.println("번호를 알맞게 입력해주세요.");
		}
	}
}
