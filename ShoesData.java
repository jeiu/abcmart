/* time : 13:52
 * author : 김태성
 * how : ShoesObject타입을 선언하여 HashMap 에 저장하는 Class
 */

package shoesMall;

import java.util.HashMap;
//스캐너
import java.util.Scanner;

public class ShoesData {
	
	Scanner scan = new Scanner(System.in);
	
	ShoesObject shoesObject = new ShoesObject();
	HashMap<String, ShoesObject> shoesData = new HashMap<String, ShoesObject>();
	
	
	/* time : 13:52
	 * author : 김태성
	 * how : shoesObject에 값을 입력하여 shoesData에 추가하는 메소드
	 */
	public void input() {
		
		String retry;
		
		while(true) {
		
		//초기화
			shoesObject = new ShoesObject();
			
			System.out.print("등록할 제품명 : ");
			shoesObject.sName = scan.next();
			
			System.out.print("\n제품의 가격 : ");
			shoesObject.sPrice = scan.nextInt();
			
			System.out.print("\n제품의 번호 : ");
			shoesObject.sNumber = scan.nextInt();
			
			shoesData.put(shoesObject.sName, shoesObject);
			
			System.out.println("제품 조회를 계속 하시겠습니까?\n계속하기:Y  그만두기:any key");
			retry = scan.next();
			
			if(retry.equals("Y")||retry.equals("y")) {
				System.out.println("제품 조회를 계속합니다.");
			}else {
				System.out.println("제품 조회를 마칩니다.");
				break;
			}
		}
	}
	
	
	/* time : 13:52
	 * author : 김태성
	 * how : search에 값을 입력하여 shoesData에서 key값을 검색해 value값을 찾아 shoesObject에 저장하고 출력하는 메소드
	 */
	public void lookup() {
		
		String retry;
		
		while(true) {
			retry = null;
			String search = null;
			shoesObject = new ShoesObject();
			
			System.out.print("검색할 제품의 이름 : ");
			search = scan.next();
			
			try {
				shoesObject = shoesData.get(search);
				System.out.println("\n제품의 이름 : "+shoesObject.sName);
				System.out.println("\n제품의 가격 : "+shoesObject.sPrice);
				System.out.println("\n제품의 번호 : "+shoesObject.sNumber);
			}catch (NullPointerException e) {
				System.out.println("등록된 정보가 없습니다.");
			}finally {
				System.out.println("제품 조회를 계속 하시겠습니까?\n계속하기:Y  그만두기:any key");
				retry = scan.next();
				
				if(retry.equals("Y")||retry.equals("y")) {
					System.out.println("제품 조회를 계속합니다.");
				}else {
					System.out.println("제품 조회를 마칩니다.");
					break;
				}
			}
		}
	}
	
}