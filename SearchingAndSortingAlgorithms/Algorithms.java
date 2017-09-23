package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> pearls) {
		int pearlsCounted = 0;
		 for(int i = 0; i < pearls.size(); i++) {
			 if(pearls.get(i)) {
				 pearlsCounted++;
			 }
		 }
		 return pearlsCounted;
	}
	//Add other methods here
	public static double findTallest(List<Double> peeps) {
		double tallestHeight = 0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > tallestHeight) {
				tallestHeight = peeps.get(i);
			}
		}
		return tallestHeight;
	}
	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
}