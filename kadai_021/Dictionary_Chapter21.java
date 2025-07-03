package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void referer(String[] word) {
	
	HashMap<String,String> wordMap = new HashMap<>();
	
	wordMap.put("apple","りんご");
	wordMap.put("peach","桃");
	wordMap.put("banana","バナナ");
	wordMap.put("lemon","レモン");
	wordMap.put("pear","梨");
	wordMap.put("kiwi","キウイ");
	wordMap.put("strawberry","いちご");
	wordMap.put("grape","ぶどう");
	wordMap.put("muscat","マスカット");
	wordMap.put("cherry","さくらんぼ");
	
	String[]wordArray = {"apple","banana","grape","orange"};
	
	for(String fruit : wordArray) {
		if(wordMap.containsKey(fruit)) {
			String meaning = wordMap.get(fruit);
			System.out.println(fruit + "の意味は"+meaning);
		}else {
			System.out.println(fruit + "は辞書に存在しません");
		}
		
		
	}
	}
	
}
	
