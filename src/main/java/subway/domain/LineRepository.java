package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {

    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static void addSection(String Line, String newStation, int sequence) {
        for (Line line : lines) {
            if (line.getName().equals(Line)) {
                line.station.add(sequence, newStation);
            }
        }
    }

    public static void deleteSection(String Line, String station){
        for (Line line : lines){
            if (line.getName().equals(Line)) {
                int index=line.station.indexOf(station);
                line.station.remove(index);
            }
        }
    }
}
