import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

class RnaTranscription {

    private final HashMap<String, String> DnaToRnaTranscription;

    RnaTranscription() {
        this.DnaToRnaTranscription = new HashMap<>();
        DnaToRnaTranscription.put("G", "C");
        DnaToRnaTranscription.put("C", "G");
        DnaToRnaTranscription.put("T", "A");
        DnaToRnaTranscription.put("A", "U");
    }

    String transcribe(String dnaStrand) {
        return dnaStrand.equals("") ? "" :
                Arrays.stream(dnaStrand.split("")).
                        map(DnaToRnaTranscription::get).
                        collect(Collectors.joining());
    }

}
