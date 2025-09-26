package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    
    private final String[] hands = {"r", "s", "p"};
    
    private final HashMap<String, String> handNames = new HashMap<>();

    public Jyanken_Chapter28() {
        handNames.put("r", "グー");
        handNames.put("s", "チョキ");
        handNames.put("p", "パー");
    }

    
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        while (true) {
            String choice = scanner.nextLine();
            if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
                return choice;
            } else {
                System.out.println("入力が正しくありません。もう一度入力してください。");
            }
        }
    }

    
    public String getRandom() {
       
        int index = (int)Math.floor(Math.random() * 3);
        return hands[index];
    }

   
    public void playGame(String myChoice, String opponentChoice) {
        System.out.println("自分の手は" + handNames.get(myChoice) + "、対戦相手の手は" + handNames.get(opponentChoice));
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}