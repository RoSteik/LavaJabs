package iot.lviv.ua.manager;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class WordsSorterTest {

    @Test
    public void testSortingWordsMethod() {
        WordsSorter sorter = new WordsSorter();
        List<String> firstExpectedListOfWords = List.of("L", "k", "m", "p", "x", "yaa", "ggaaa", "waaa");
        List<String> firstActualListOfWords = sorter.sortWordsInText(new StringBuilder("L, k; m. p, x waaa ggaaa yaa"), 'a');

        List<String> secondExpectedListOfWords = List.of("abbb", "kbbb", "pbbb", "wbbb", "xbbb");
        List<String> secondActualListOfWords = sorter.sortWordsInText(new StringBuilder(" xbbb kbbb abbb wbbb, pbbb "), 'b');

        List<String> thirdExpectedListOfWords = List.of("H", "W", "k", "x", "y");
        List<String> thirdActualListOfWords = sorter.sortWordsInText(new StringBuilder(" y, x, k, H. W"), 'a');

        assertThat(firstActualListOfWords, is(firstExpectedListOfWords));
        assertThat(secondActualListOfWords, is(secondExpectedListOfWords));
        assertThat(thirdActualListOfWords, is(thirdExpectedListOfWords));
    }

}