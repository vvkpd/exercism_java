import java.util.concurrent.atomic.AtomicInteger;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replaceAll("-", "");
        return isValidIsbn(stringToVerify);
    }


    private boolean isValidIsbn(String isbnToBeVerify) {
        return checkGrammarOfIsbn(isbnToBeVerify) && checkIsbn(isbnToBeVerify);
    }

    private boolean checkGrammarOfIsbn(String isbnToBeVerify) {
        return checkLengthAndLastElementIsX(isbnToBeVerify) && checkAllElementsAreDigitsExceptLast(isbnToBeVerify);
    }

    private boolean checkLengthAndLastElementIsX(String isbn) {
        return isbn.length() == 10 && String.valueOf(isbn.charAt(9)).matches("\\d|[X]");
    }

    private boolean checkAllElementsAreDigitsExceptLast(String isbn) {
        return isbn.substring(0, 9).chars().allMatch(Character::isDigit);
    }

    private boolean checkIsbn(String isbn) {
        AtomicInteger counter = new AtomicInteger(10);
        int sum = isbn.chars().map(character -> getInteger((char) character)).reduce(0, (acc, cur) -> acc + (cur * counter.getAndDecrement()));
        return (sum % 11) == 0;
    }

    private int getInteger(char character) {
        return character == 'X' ? 10 : Character.getNumericValue(character);
    }
}
