/**
  Created by RoSteik (Telegram: @RoSteik)
  Project name: Laboratorna_2_3_Java
  Package name: iot.lviv.ua.manager
  Class: RegEx
 */
package iot.lviv.ua.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
public class WordsSorter {

    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    private static class WordAndNumber implements Comparator<WordAndNumber>, Serializable {
        private String word;
        private int numberOfInputLetterInWord;

        @Override
        public int compare(WordAndNumber wn1, WordAndNumber wn2) {
            if (wn1.numberOfInputLetterInWord == wn2.numberOfInputLetterInWord) {
                return wn1.word.compareTo(wn2.word);
            } else if (wn1.numberOfInputLetterInWord > wn2.numberOfInputLetterInWord) {
                return 1;
            }

            return -1;
        }
    }

    private List<String> divideTextIntoWords(StringBuilder text) {
        List<String> words = new LinkedList<>();

        Pattern pattern = Pattern.compile("[^\\s(.!?,:;\")]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words.add(text.substring(matcher.start(), matcher.end()));
            text = new StringBuilder(text.substring(matcher.end()));
            matcher = pattern.matcher(text);
        }

        return words;
    }

    public List<String> sortWordsInText(StringBuilder text, char letter) {
        List<String> words = divideTextIntoWords(text);
        int[] numbersOfInputLetterInWords = new int[words.size()];

        List<WordAndNumber> wordWithNumberList = new LinkedList<>();
        List<String> sortedWordsList = new LinkedList<>(); // - to store result

        //Storing words that have input letter in numbersOfLetterInWords - array
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (words.get(i).charAt(j) == letter) {
                    numbersOfInputLetterInWords[i]++;
                }
            }
        }

        //Adding and sorting words in ascending order
        for (int index = 0; index < numbersOfInputLetterInWords.length; ++index) {
            wordWithNumberList.add(new WordAndNumber(words.get(index), numbersOfInputLetterInWords[index]));
        }
        wordWithNumberList.sort(new WordAndNumber());

        for (WordAndNumber value : wordWithNumberList) {
            sortedWordsList.add(value.word);
        }

        return sortedWordsList;
    }

}
