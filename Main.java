/* time : 12:20
 * author : ���¿�
 * how : ��ü���� ������ ��Ÿ���� ������ ���� Ŭ����
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
		System.out.println("     1. ��ǰ ���� �߰�");
		System.out.println("     2. ��ǰ ���� ��ȸ");
		System.out.println("     3. ��ǰ ���� ����");
		System.out.println("     Q. �ý��� ����");
		System.out.println("-------------------------");
		
		int select_m = scan.nextInt();
		
		while(true) {
			switch(select_m) {
				case 1: //��ǰ ���� �߰�
					shoesInput();
					break;	
				case 2: //��ǰ ���� ��ȸ
					shoesLookup();
					break;
				case 3: //��ǰ ���� ����
					shoesModordel();
				default:
					System.out.println("��ȣ�� �˸°� �Է����ּ���.");
			}
		}
	}
	
	/* time : 15:30
	 * author : ���¿�
	 * how : ��ǰ ���� �߰� �޼ҵ�
	 */
	public void shoesInput() {
		System.out.println("��ǰ ������ �߰��մϴ�.");
		System.out.println("1. ĳ�־�ȭ");
		System.out.println("2. ����Ŀ��");
		System.out.println("3. �ȭ");
		
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
	 * author : ���¿�
	 * how : ��ǰ ���� ��ȸ �޼ҵ�
	 */
	public void shoesLookup() {
		System.out.println("��ǰ ������ ��ȸ�մϴ�.");
		System.out.println("1. ĳ�־�ȭ");
		System.out.println("2. ����Ŀ��");
		System.out.println("3. �ȭ");
		
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
	 * author : ���¿�
	 * how : ��ǰ ���� ���� �� ���� �޼ҵ�
	 */
	public void shoesModordel() {
		System.out.println("��ǰ ������ ��ȸ�մϴ�.");
		System.out.println("1. ĳ�־�ȭ");
		System.out.println("2. ����Ŀ��");
		System.out.println("3. �ȭ");
		
		int select = scan.nextInt();
		
		if(select == 1) {
			int select2 = scan.nextInt();
			
			System.out.println("1. ��ǰ ����");
			System.out.println("2. ��ǰ ����");
			
			if(select2 == 1) {
				sd_c.modify();
			} else if(select2 == 2) {
				sd_c.delete();
			} else {
				System.out.println("��ȣ�� �˸°� �Է����ּ���.");
			}
			
		} else if(select == 2) {
			int select2 = scan.nextInt();
			
			System.out.println("1. ��ǰ ����");
			System.out.println("2. ��ǰ ����");
			
			if(select2 == 1) {
				sd_sn.modify();
			} else if(select2 == 2) {
				sd_sn.delete();
			} else {
				System.out.println("��ȣ�� �˸°� �Է����ּ���.");
			}
			
		} else if(select == 3) {
			int select2 = scan.nextInt();
			
			System.out.println("1. ��ǰ ����");
			System.out.println("2. ��ǰ ����");
			
			if(select2 == 1) {
				sd_sp.modify();
			} else if(select2 == 2) {
				sd_sp.delete();
			} else {
				System.out.println("��ȣ�� �˸°� �Է����ּ���.");
			}
		} else {
			System.out.println("��ȣ�� �˸°� �Է����ּ���.");
		}
	}
}
