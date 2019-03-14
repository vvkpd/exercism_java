import java.util.Arrays;
import java.util.HashMap;

class IsogramChecker {
    public IsogramChecker() {
    }

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll("-", "");
        phrase = phrase.replaceAll(" ", "");

        HashMap<String, Integer> alphabetCountMap = new HashMap<>();

        Arrays.stream(phrase.toUpperCase().split("")).forEach(alphabet -> {
            if (alphabetCountMap.containsKey(alphabet))
                alphabetCountMap.replace(alphabet, alphabetCountMap.get(alphabet) + 1);
            alphabetCountMap.putIfAbsent(alphabet, 1);
        });
        return alphabetCountMap.values().stream().allMatch(times -> times == 1);
    }

}
