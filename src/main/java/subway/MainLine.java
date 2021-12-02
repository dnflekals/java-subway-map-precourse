package subway;

import java.util.Scanner;
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
        }
    }
}
