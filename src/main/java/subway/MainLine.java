package subway;

import java.util.Scanner;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.view.View;

public class MainLine {

    private final Scanner scanner = new Scanner(System.in);
    private Validation validation = new Validation();
    private View view = new View();
    private final String BACK = "B";
    private final int ADD_LINE = 1;
    private final int DELETE_LINE = 2;
    private final int SHOW_LINE = 3;
    private LineRepository lineRepository;

    public void manageLine(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
        String lineInput = "";
        while (!lineInput.equals(BACK)) {
            view.printLineMenu();
            lineInput = scanner.nextLine();
            if (performStationTask(lineInput)) {
                lineInput = BACK;
            }
        }
    }

    private boolean performStationTask(String stationInput) {
        if (validation.checkLineValueIsValid(stationInput)) {
            int number = Integer.parseInt(stationInput);
            checkLineTask(number);
            return true;
        }
        if (stationInput.equals(BACK)) {
            return true;
        }
        view.printErrorOfMainTask();
        return false;
    }

    private void checkLineTask(int number) {
        if (number == ADD_LINE) {
            addLine();
        }
        if (number == DELETE_LINE) {
            deleteLine();
        }
        if (number == SHOW_LINE) {
            showLine();
        }
    }

    private void addLine() {
        view.printAddLine();
        String newLine = scanner.nextLine();
        view.printUpBoundStation();
        String upBoundStation = scanner.nextLine();
        view.printDownBoundStation();
        String downBoundStation = scanner.nextLine();

        lineRepository.addLine(new Line(newLine));
        for (Line line : lineRepository.lines()) {
            if (line.getName() == newLine) {
                line.addStation(upBoundStation);
                line.addStation(downBoundStation);
            }
        }
        view.printInfoOfAddLine();
    }

    private void deleteLine() {
        view.printDeleteLine();
        String lineName = scanner.nextLine();
        lineRepository.deleteLineByName(lineName);
        view.printInfoOfDeleteLine();
    }

    private void showLine() {
        view.printListOfLine();
        for(Line lines:lineRepository.lines()){
            System.out.print("[INFO] ");
            System.out.println(lines.getName());
        }
    }
}
