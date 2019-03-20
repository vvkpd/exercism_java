import java.util.Arrays;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String number = String.valueOf(numberToCheck);

        int sum = Arrays.stream(number.split(""))
                .mapToInt(Integer::parseInt)
                .map(num -> (int) Math.pow(num, number.length()))
                .sum();

        return sum == numberToCheck;
    }

}
