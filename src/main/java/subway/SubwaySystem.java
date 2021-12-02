package subway;

import java.util.Scanner;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.LineRepository;
import subway.view.View;

public class SubwaySystem {

    private final Scanner scanner;
    public StationRepository stationRepository;
    public LineRepository lineRepository;
    private Validation validation = new Validation();
    private View view = new View();
    private MainStation mainStation = new MainStation();
    private MainLine mainLine = new MainLine();
    private final String EXIT = "Q";
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
        if (validation.checkMainValueIsValid(mainInput)) {
            int number = Integer.parseInt(mainInput);
            checkMainTask(number);
            return;
        }
        if (mainInput.equals(EXIT)) {
            return;
        }
        view.printErrorOfMainTask();
    }

    private void checkMainTask(int number) {
        if (number == MANAGE_STATION) {
            mainStation.manageStation(stationRepository);
        }
        if (number == MANAGE_LINE) {
            mainLine.manageLine(lineRepository);
        }
        if (number == MANAGE_SECTION) {

        }
        if (number == MANAGE_MAP) {

        }
    }
}
