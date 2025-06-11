package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	// じゃんけんの手を入力
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
                break;
            } else {
                System.out.println("エラー：正しい手を入力してください（r, s, p）");
            }
        }
        return choice;
    }

    // 対戦相手の手をランダムに選ぶ
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3);
        return hands[index];
    }

    // じゃんけんを行う
    public void playGame(String myChoice, String opponentChoice) {
        // じゃんけん手の表示用マップ
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

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
