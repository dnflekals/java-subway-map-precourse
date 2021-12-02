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
    private final String BACK = "B";
    private final int MANAGE_STATION = 1;
    private final int MANAGE_LINE = 2;
    private final int MANAGE_SECTION = 3;
    private final int MANAGE_MAP = 4;

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
            checkMainTask(number);
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

    private void checkMainTask(int number) {
        if (number == MANAGE_STATION) {
            manageStation();
        }
        if (number == MANAGE_LINE) {

        }
        if (number == MANAGE_SECTION) {

        }
        if (number == MANAGE_MAP) {

        }
    }

    private void manageStation() {
        String stationInput = "";
        while (!stationInput.equals(BACK)) {
            view.printStationMenu();
            stationInput = scanner.nextLine();
        }
    }
}
