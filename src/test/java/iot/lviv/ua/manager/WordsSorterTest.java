package iot.lviv.ua.manager;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class WordsSorterTest {
    @Test
    public void testSortingWordsMethod(){
        WordsSorter sorter = new WordsSorter();
        List<String> expectedListOfWords = List.of("L", "k", "m", "p", "x", "yaa", "ggaaa", "waaa");
        List<String> actualListOfWords = sorter.sortWordsInText(new StringBuilder("L, k; m. p, x waaa ggaaa yaa"), 'a');

        assertThat(actualListOfWords, is(expectedListOfWords));
    }

}