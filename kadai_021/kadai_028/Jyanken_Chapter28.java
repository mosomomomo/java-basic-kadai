package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				         + "グーはrockのrを入力しましょう\n"
				         + "チョキはscissorsのsを入力しましょう\n"
				         + "パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
	    String input = "";

	    while (!(input.equals("r") || input.equals("s") || input.equals("p"))) {
	        input = scanner.next();
	        if(!(input.equals("r") || input.equals("s") || input.equals("p"))) {
		    	System.out.print("再度手を入力してください");
		        }
	    }

	    scanner.close(); 
	    return input;
	    
	}
	
	public String getRandom(){
		int random = (int)Math.floor(Math.random() * 3);
		
		if(random == 0) {
	    	return "r";
	    }else if(random == 1) {
	    	return "s";
	    }else{
	    	return "p";
	    }

	}
	
	public void playGame() {
		String outm = getMyChoice();
		String oute = getRandom();
		
		HashMap<String, String> hand = new HashMap<String, String>();
		
			hand.put("r", "グー");
			hand.put("s", "チョキ");
			hand.put("p", "パー");
			
		System.out.println("自分の手は" + hand.get(outm) + "相手の手は" + hand.get(oute));
		
		if(outm.equals(oute)) {
			System.out.println("あいこです");
		}else if(outm.equals("r") && oute.equals("s") || 
				 outm.equals("s") && oute.equals("p") ||
				 outm.equals("p") && oute.equals("r")){
			System.out.println("自分の勝ちです");
		}else if(outm.equals("s") && oute.equals("r") ||
				 outm.equals("p") && oute.equals("s") ||
				 outm.equals("r") && oute.equals("p")){
			System.out.println("自分の負けです");
		}
	}
}
