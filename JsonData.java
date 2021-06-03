package shoesMall;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonData {
	JSONParser parser = new JSONParser();
	JSONObject jsonObject = new JSONObject();
	Scanner scan = new Scanner(System.in);
	
	void input() {
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
		
		JSONArray list = new JSONArray();
        System.out.println("상품명을 입력해 주세요.");
        sName = scan.next();
        list.add("Name : "+sName);
        
        System.out.println("상품가격을 입력해 주세요.");
        sPrice = scan.next();
        list.add("Price : "+sPrice);
        
        System.out.println("상품분류를 입력해 주세요.");
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
		System.out.println((jsonObject.size()) + "번째 상품이 추가되었습니다.");
		break;
	}
	
	void lookup() {
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
		System.out.println("조회하실 상품의 번호를 입력해 주세요.");
		int lookupNum = scan.nextInt();
		if (lookupNum < 1 || lookupNum - 1 > (int)jsonObject.size()) {
			System.out.println("올바르지 않은 상품 정보입니다.");
			break;
		}
		
		System.out.println(lookupNum + "번째 상품 정보입니다.");
		JSONArray loadList = (JSONArray)jsonObject.get("Info" + lookupNum);
        Iterator<String>iterator = loadList.iterator();
        while(iterator.hasNext()) {
               System.out.println(iterator.next());
        }
	}
	
	void modify() {
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
		
		System.out.println("수정하실 상품의 번호를 입력해 주세요.");
		int modifyNum = scan.nextInt();
		if (modifyNum < 1 || modifyNum - 1 > (int)jsonObject.size()) {
			System.out.println("올바르지 않은 상품 정보입니다.");
			break;
		}
		
		// Modify info
        list = new JSONArray();
        System.out.println("상품명을 입력해 주세요.");
        sName = scan.next();
        list.add("Name : "+sName);
        
        System.out.println("상품가격을 입력해 주세요.");
        sPrice = scan.next();
        list.add("Price : "+sPrice);
        
        System.out.println("상품분류를 입력해 주세요.");
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
		System.out.println(modifyNum + "번째 상품이 수정되었습니다.");
	}
}
