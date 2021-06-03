package abcmart;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Scanner;
/*
 Date		'21.06.03 03:43
 
 How		���ؿ�	���� json���� �ҷ��� �� ��ǰ �߰� ��� �߰�.
 					���� json���� �ҷ��� �� ��ǰ ��ȸ ��� �߰�.
 					���� json���� �ҷ��� �� ��ǰ ���� ��� �߰�.
 			���¿�	��ü���� Ʋ ����.
 			
 Author		���ؿ�,  ���¿�
 
 Version	1.0.1
 */
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoesData sd = new ShoesData();
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = new JSONObject();
		String sName = "";
		String sPrice = "";
		String sClassification = "";
		
		System.out.println("-------------------------");
		System.out.println("     1. ��ǰ ���� �߰�");
		System.out.println("     2. ��ǰ ���� ��ȸ");
		System.out.println("     3. ��ǰ ���� ����");
		System.out.println("     4. ���� ���� ��ȸ");
		System.out.println("-------------------------");
		
		int select = scan.nextInt();
		
		switch(select) {
			case 1: // Add info
				try {
					Object savedJson = parser.parse(new FileReader("d:\\test.json"));
					jsonObject = (JSONObject)savedJson;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					try {
						// If file not founded save empty file
						FileWriter file = new FileWriter("d:\\test.json");
						file.write(jsonObject.toJSONString());
						file.flush();
						file.close();
					} catch (IOException f) {
						f.printStackTrace();
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
		        
		        /* Print Current Info
		        System.out.print(jsonObject);
		        */
		        
		        // Add info
		        list = new JSONArray();
		        System.out.println("��ǰ���� �Է��� �ּ���.");
		        sName = scan.next();
		        list.add("Name : "+sName);
		        
		        System.out.println("��ǰ������ �Է��� �ּ���.");
		        sPrice = scan.next();
		        list.add("Price : "+sPrice);
		        
		        System.out.println("��ǰ�з��� �Է��� �ּ���.");
		        sClassification = scan.next();
		        list.add("Classification : "+sClassification);
		        
		    	jsonObject.put("Info" + (jsonObject.size() + 1), list);
		    	
		    	// Save current info file
				try {
					FileWriter file = new FileWriter("d:\\test.json");
					file.write(jsonObject.toJSONString());
					file.flush();
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println((jsonObject.size()) + "��° ��ǰ�� �߰��Ǿ����ϴ�.");
				break;
				
			case 2: // Lookup info
				try {
					Object savedJson = parser.parse(new FileReader("d:\\test.json"));
					jsonObject = (JSONObject)savedJson;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					try {
						// If file not founded save empty file
						FileWriter file = new FileWriter("d:\\test.json");
						file.write(jsonObject.toJSONString());
						file.flush();
						file.close();
					} catch (IOException f) {
						f.printStackTrace();
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				// Print Current Info
				System.out.println("��ȸ�Ͻ� ��ǰ�� ��ȣ�� �Է��� �ּ���.");
				int lookupNum = scan.nextInt();
				if (lookupNum < 1 || lookupNum - 1 > (int)jsonObject.size()) {
					System.out.println("�ùٸ��� ���� ��ǰ �����Դϴ�.");
					break;
				}
				
				System.out.println(lookupNum + "��° ��ǰ �����Դϴ�.");
				JSONArray loadList = (JSONArray)jsonObject.get("Info" + lookupNum);
                Iterator<String>iterator = loadList.iterator();
                while(iterator.hasNext()) {
                       System.out.println(iterator.next());
                }
				break;
				
			case 3: // Modify info
				try {
					Object savedJson = parser.parse(new FileReader("d:\\test.json"));
					jsonObject = (JSONObject)savedJson;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					try {
						// If file not founded save empty file
						FileWriter file = new FileWriter("d:\\test.json");
						file.write(jsonObject.toJSONString());
						file.flush();
						file.close();
					} catch (IOException f) {
						f.printStackTrace();
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				System.out.println("�����Ͻ� ��ǰ�� ��ȣ�� �Է��� �ּ���.");
				int modifyNum = scan.nextInt();
				if (modifyNum < 1 || modifyNum - 1 > (int)jsonObject.size()) {
					System.out.println("�ùٸ��� ���� ��ǰ �����Դϴ�.");
					break;
				}
				
				// Modify info
		        list = new JSONArray();
		        System.out.println("��ǰ���� �Է��� �ּ���.");
		        sName = scan.next();
		        list.add("Name : "+sName);
		        
		        System.out.println("��ǰ������ �Է��� �ּ���.");
		        sPrice = scan.next();
		        list.add("Price : "+sPrice);
		        
		        System.out.println("��ǰ�з��� �Է��� �ּ���.");
		        sClassification = scan.next();
		        list.add("Classification : "+sClassification);
		        
		    	jsonObject.put("Info" + modifyNum, list);
		    	
		    	// Save current info file
				try {
					FileWriter file = new FileWriter("d:\\test.json");
					file.write(jsonObject.toJSONString());
					file.flush();
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(modifyNum + "��° ��ǰ�� �����Ǿ����ϴ�.");
				break;
				
			default: 			
		}
	}
}
