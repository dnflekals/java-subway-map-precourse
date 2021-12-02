package subway;

import java.util.Scanner;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.View;

public class MainStation {

    private final Scanner scanner = new Scanner(System.in);
    private Validation validation = new Validation();
    private View view = new View();
    private final String BACK = "B";
    private final int ADD_STATION = 1;
    private final int DELETE_STATION = 2;
    private final int CHECK_STATION = 3;
    private StationRepository stationRepository;

    public void manageStation(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
        String stationInput = "";
        while (!stationInput.equals(BACK)) {
            view.printStationMenu();
            stationInput = scanner.nextLine();
            performStationTask(stationInput);
        }
    }

    private void performStationTask(String stationInput) {
        if (validation.checkStationValueIsValid(stationInput)) {
            int number = Integer.parseInt(stationInput);
            checkStationTask(number);
            return;
        }
        view.printErrorOfMainTask();
    }

    private void checkStationTask(int number) {
        if (number == ADD_STATION) {
            addStation();
        }
        if (number == DELETE_STATION) {

        }
        if (number == CHECK_STATION) {

        }
    }

    private void addStation() {
        view.printAddStation();
        String station = scanner.nextLine();
        stationRepository.addStation(new Station(station));
        view.printRegisterOfStation();
    }
}
