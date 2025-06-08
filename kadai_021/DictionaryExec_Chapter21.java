package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べたい英単語リスト
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        for (int i = 0; i < wordsToSearch.length; i++) {
            String word = wordsToSearch[i];
            String meaning = dictionary.search(word);

            if (meaning != null) {
                System.out.println((i + 1) + word + "の意味は" + meaning);
            } else {
                System.out.println((i + 1) + word + "は辞書に存在しません");
            }
        }
    }	


}
