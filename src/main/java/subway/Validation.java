package subway;

public class Validation {

    public boolean checkValueIsValid(String mainInput) {
        if (isNumber(mainInput)) {
            int number = Integer.parseInt(mainInput);
            if (0 < number && number < 5) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumber(String inputCount) {
        boolean isNumeric = inputCount.matches("[+-]?\\d*(\\.\\d+)?");
        return isNumeric;
    }
}
