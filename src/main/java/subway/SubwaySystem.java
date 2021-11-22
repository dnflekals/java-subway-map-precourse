package subway;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.Line;
import subway.domain.LineRepository;

import java.util.Scanner;

public class SubwaySystem {

    private final Scanner scanner;
    public StationRepository stationRepository;
    public LineRepository lineRepository;

    public SubwaySystem(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        initializeSetting();
    }

    private void initializeSetting() {
        InitialSetting initialSetting = new InitialSetting(stationRepository, lineRepository);
        initialSetting.setDefaultValues();
    }
}
