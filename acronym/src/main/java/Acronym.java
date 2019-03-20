import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String str = phrase.replaceAll("[-_\\s]+", " ");
        return Arrays.stream(str.split(" "))
                .map(word -> String.valueOf(word.charAt(0)).toUpperCase())
                .collect(Collectors.joining());
    }

}
