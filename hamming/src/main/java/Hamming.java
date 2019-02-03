class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        int hammingDistance = 0;
        for (int index = 0; index < leftStrand.length(); index++) {
            if (leftStrand.charAt(index) != rightStrand.charAt(index))
                hammingDistance++;
        }
        return hammingDistance;
    }

}
