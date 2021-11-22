package subway;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class InitialSetting {

    private StationRepository stationRepository;
    private LineRepository lineRepository;

    public InitialSetting(StationRepository stationRepository, LineRepository lineRepository) {
        this.stationRepository = stationRepository;
        this.lineRepository = lineRepository;
    }

    void setDefaultValues() {
        addInitialStation();
        addInitialLine();
    }

    private void addInitialStation() {
        stationRepository.addStation(new Station("교대역"));
        stationRepository.addStation(new Station("강남역"));
        stationRepository.addStation(new Station("역삼역"));
        stationRepository.addStation(new Station("남부터미널역"));
        stationRepository.addStation(new Station("양재역"));
        stationRepository.addStation(new Station("양재시민의숲역"));
        stationRepository.addStation(new Station("매봉역"));
    }

    private void addInitialLine() {
        lineRepository.addLine(new Line("2호선"));
        lineRepository.addLine(new Line("3호선"));
        lineRepository.addLine(new Line("신분당선"));
    }
}
