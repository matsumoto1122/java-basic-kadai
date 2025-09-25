package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // r, s, pを日本語にひもづけ
    private Map<String, String> handMap = new HashMap<>();

    public Jyanken_Chapter28() {
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    // 自分の手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        while (true) {
            String input = scanner.nextLine();
            if (handMap.containsKey(input)) {
                return input;
            } else {
                System.out.println("入力が正しくありません。もう一度入力してください。");
            }
        }
    }

    // 相手の手をランダムで選ぶ
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        Random rand = new Random();
        int index = rand.nextInt(3);
        return hands[index];
    }

    // じゃんけん結果を判定し表示する
    public void playGame(String my, String opponent) {
        System.out.println("自分の手は" + handMap.get(my) + "、対戦相手の手は" + handMap.get(opponent));

        if (my.equals(opponent)) {
            System.out.println("あいこです");
        } else if (
                (my.equals("r") && opponent.equals("s")) ||
                (my.equals("s") && opponent.equals("p")) ||
                (my.equals("p") && opponent.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}