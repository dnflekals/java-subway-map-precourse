package subway;

public class Validation {

    public boolean checkMainValueIsValid(String mainInput) {
        if (isNumber(mainInput)) {
            int number = Integer.parseInt(mainInput);
            if (0 < number && number < 5) {
                return true;
            }
        }
        return false;
    }

    public boolean checkStationValueIsValid(String mainInput) {
        if (isNumber(mainInput)) {
            int number = Integer.parseInt(mainInput);
            if (0 < number && number < 4) {
                return true;
            }
        }
        return false;
    }

    public boolean checkLineValueIsValid(String mainInput) {
        if (isNumber(mainInput)) {
            int number = Integer.parseInt(mainInput);
            if (0 < number && number < 4) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSectionValueIsValid(String mainInput) {
        if (isNumber(mainInput)) {
            int number = Integer.parseInt(mainInput);
            if (0 < number && number < 3) {
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
