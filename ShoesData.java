/* time : 13:52
 * author : ���¼�
 * how : ShoesObjectŸ���� �����Ͽ� HashMap �� �����ϴ� Class
 */

package shoesMall;

import java.util.HashMap;
//��ĳ��
import java.util.Scanner;

public class ShoesData {
	
	Scanner scan = new Scanner(System.in);
	
	ShoesObject shoesObject = new ShoesObject();
	HashMap<String, ShoesObject> shoesData = new HashMap<String, ShoesObject>();
	
	
	/* time : 13:52
	 * author : ���¼�
	 * how : shoesObject�� ���� �Է��Ͽ� shoesData�� �߰��ϴ� �޼ҵ�
	 */
	public void input() {
		
		String retry;
		
		while(true) {
		
		//�ʱ�ȭ
			shoesObject = new ShoesObject();
			
			System.out.print("����� ��ǰ�� : ");
			shoesObject.sName = scan.next();
			
			System.out.print("\n��ǰ�� ���� : ");
			shoesObject.sPrice = scan.nextInt();
			
			System.out.print("\n��ǰ�� ��ȣ : ");
			shoesObject.sNumber = scan.nextInt();
			
			shoesData.put(shoesObject.sName, shoesObject);
			
			System.out.println("��ǰ ��ȸ�� ��� �Ͻðڽ��ϱ�?\n����ϱ�:Y  �׸��α�:any key");
			retry = scan.next();
			
			if(retry.equals("Y")||retry.equals("y")) {
				System.out.println("��ǰ ��ȸ�� ����մϴ�.");
			}else {
				System.out.println("��ǰ ��ȸ�� ��Ĩ�ϴ�.");
				break;
			}
		}
	}
	
	
	/* time : 13:52
	 * author : ���¼�
	 * how : search�� ���� �Է��Ͽ� shoesData���� key���� �˻��� value���� ã�� shoesObject�� �����ϰ� ����ϴ� �޼ҵ�
	 */
	public void lookup() {
		
		String retry;
		
		while(true) {
			retry = null;
			String search = null;
			shoesObject = new ShoesObject();
			
			System.out.print("�˻��� ��ǰ�� �̸� : ");
			search = scan.next();
			
			try {
				shoesObject = shoesData.get(search);
				System.out.println("\n��ǰ�� �̸� : "+shoesObject.sName);
				System.out.println("\n��ǰ�� ���� : "+shoesObject.sPrice);
				System.out.println("\n��ǰ�� ��ȣ : "+shoesObject.sNumber);
			}catch (NullPointerException e) {
				System.out.println("��ϵ� ������ �����ϴ�.");
			}finally {
				System.out.println("��ǰ ��ȸ�� ��� �Ͻðڽ��ϱ�?\n����ϱ�:Y  �׸��α�:any key");
				retry = scan.next();
				
				if(retry.equals("Y")||retry.equals("y")) {
					System.out.println("��ǰ ��ȸ�� ����մϴ�.");
				}else {
					System.out.println("��ǰ ��ȸ�� ��Ĩ�ϴ�.");
					break;
				}
			}
		}
	}
	
}