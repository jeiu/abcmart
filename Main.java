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
		System.out.println("     1. ��ǰ ���� �߰�");
		System.out.println("     2. ��ǰ ���� ��ȸ");
		System.out.println("     3. ��ǰ ���� ����");
		System.out.println("     4. ���� ���� ��ȸ");
		System.out.println("-------------------------");
		
		int select = scan.nextInt();
		
		switch(select) {
			case 1: //��ǰ ���� �߰�
				//sd.input();
				break;
			case 2: //��ǰ ���� ��ȸ
				
			case 3: //��ǰ ���� ����
			
			case 4: //���� ���� ��ȸ
			
			default: 			
		}
	}
}
