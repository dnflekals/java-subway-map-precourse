package subway;

import java.awt.print.Printable;
import java.util.Scanner;
import java.util.ArrayList;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.view.View;

public class SubwaySystem {

    private final Scanner scanner;
    public StationRepository stationRepository;
    public LineRepository lineRepository;
    private View view = new View();
    private final String EXIT = "Q";

    public SubwaySystem(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        initializeSetting();
        mainSystem();
    }

    private void initializeSetting() {
        InitialSetting initialSetting = new InitialSetting(stationRepository, lineRepository);
        initialSetting.setDefaultValues();
    }

    private void mainSystem() {
        String mainInput = "";
        while (!mainInput.equals(EXIT)) {
            view.printMainMenu();
            mainInput = scanner.nextLine();
            performMainTask(mainInput);
        }
    }

    private void performMainTask(String mainInput) {
        if (checkValueIsValid(mainInput)) {
            int number = Integer.parseInt(mainInput);
            return;
        }
        view.printErrorOfMainTask();
    }

    private boolean checkValueIsValid(String mainInput) {
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
