package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> pearls) {
		int pearlsCounted = 0;
		for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i)) {
				pearlsCounted++;
			}
		}
		return pearlsCounted;
	}

	// Add other methods here
	public static double findTallest(List<Double> peeps) {
		double tallestHeight = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallestHeight) {
				tallestHeight = peeps.get(i);
			}
		}
		return tallestHeight;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {
		ArrayList<Double> scoresInOrder = new ArrayList<Double>();
		boolean swaps = true;
		boolean swappedThisRound = false;
		while(swaps) {
			swappedThisRound = false;
			for(int i = 0; i < scores.size(); i++) {
				if(scores.get(i) <= scores.get(i + 1)) {
					double save = scores.get(i);
					scores.set(i, scores.get(i + 1));
					scores.set(i + 1, save);
					swappedThisRound = true;
				}
			}
			if(swappedThisRound == false) {
				swaps = true;
			}
		}
		return scores;
	}
}
