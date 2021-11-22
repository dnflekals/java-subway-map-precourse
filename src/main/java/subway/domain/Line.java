package subway.domain;

import java.util.ArrayList;

public class Line {

    private String name;
    public ArrayList<String> station = new ArrayList<>();

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStation(String stationName) {
        station.add(stationName);
    }
}
