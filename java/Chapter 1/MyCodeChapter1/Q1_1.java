package MyCodeChapter1;

public class Q1_1 {
	public static void main(String [] args) {
		String[] words = {"abcde", "abcbc", "apple", "banana", ""};
		for(String word: words) {
			System.out.println(word + ":" + isUniqueChars(word));
		}
	}
	
	
	private static boolean isUniqueChars(String word) {
		if(word.length() > 128) return false;
		
		boolean[] occured = new boolean[128];
		for(int i = 0; i < word.length(); i++) {
			int index = word.charAt(i);
			if(occured[index]) return false;
			occured[index] = true;
		}
		
		return true;
	}
}