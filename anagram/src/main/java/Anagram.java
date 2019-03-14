import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private String word;

    Anagram(String word) {
        this.word = word.toLowerCase();
    }

    List<String> match(List<String> candidates) {
        return candidates.stream().filter(this::isAnagram).collect(Collectors.toList());
    }

    private Boolean isAnagram(String wordToBeDetect) {
        boolean isNotEqual = !word.equalsIgnoreCase(wordToBeDetect);
        return isNotEqual && getSortedWord(wordToBeDetect.toLowerCase()).equalsIgnoreCase(getSortedWord(word));
    }

    private String getSortedWord(String word) {
        return Arrays.stream(word.split("")).sorted().collect(Collectors.joining());
    }
}