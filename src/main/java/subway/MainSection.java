package subway;

import java.util.Scanner;
import subway.domain.LineRepository;
import subway.view.View;

public class MainSection {

    private final Scanner scanner = new Scanner(System.in);
    private Validation validation = new Validation();
    private View view = new View();
    private final String BACK = "B";
    private final int ADD_SECTION = 1;
    private final int DELETE_SECTION = 2;
    private LineRepository lineRepository;

    public void manageSection(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
        String lineInput = "";
        while (!lineInput.equals(BACK)) {
            view.printSectionMenu();
            lineInput = scanner.nextLine();
        }
    }
}
