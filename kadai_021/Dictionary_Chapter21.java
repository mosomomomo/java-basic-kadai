package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String, String> dic = new HashMap<String, String>();
	
	public Dictionary_Chapter21() {
	
	dic.put("apple","りんご"); 
	dic.put("peach","桃");
	dic.put("banana","バナナ");
	dic.put("lemon","レモン");
	dic.put("pear","梨");
	dic.put("kiwi","キウィ");
	dic.put("strawberry","いちご");
	dic.put("grape","ぶどう");
	dic.put("muscat","マスカット");
	dic.put("cherry","さくらんぼ");
	
	}
	
	public void getMean(String[] input) {
		for(int i = 0; i<input.length; i++) {
			
			String eng = input[i];
			
			if(dic.containsKey(input[i])) {
				System.out.println(input[i] + "の意味は" + dic.get(input[i]));
			}else {
				System.out.println(input[i] + "は辞書に存在しません。");
			}
		}
	}

}
