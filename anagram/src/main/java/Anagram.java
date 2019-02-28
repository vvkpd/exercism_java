import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private String word;

    Anagram(String word) {
        this.word = word;
    }


    List<String> match(List<String> candidates) {
        return candidates.stream().filter(candidate -> {
            Arrays.stream(candidate.split("")).anyMatch(character -> word.toLowerCase().contains(character.toLowerCase()));
        }).collect(Collectors.toList());
    }
}
