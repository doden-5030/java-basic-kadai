package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 game = new Jyanken_Chapter28();

        String myChoice = game.getMyChoice(); // 入力処理
        String opponentChoice = game.getRandom(); // ランダム処理
        game.playGame(myChoice, opponentChoice); // 勝敗判定＆出力	

	}

}
