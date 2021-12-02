package subway;

import java.util.Scanner;
import subway.domain.Line;
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
        String sectionInput = "";
        while (!sectionInput.equals(BACK)) {
            view.printSectionMenu();
            sectionInput = scanner.nextLine();
            if (performSectionTask(sectionInput)) {
                sectionInput = BACK;
            }
        }
    }

    private boolean performSectionTask(String sectionInput) {
        if (validation.checkSectionValueIsValid(sectionInput)) {
            int number = Integer.parseInt(sectionInput);
            checkSectionTask(number);
            return true;
        }
        if (sectionInput.equals(BACK)) {
            return true;
        }
        return false;
    }

    private void checkSectionTask(int number) {
        if (number == ADD_SECTION) {
            addSection();
        }
        if (number == DELETE_SECTION) {
            deleteSection();
        }
    }

    private void addSection() {
        view.printAddSection();
        String Line = scanner.nextLine();
        view.printAddSectionLine();
        String newStation = scanner.nextLine();
        view.printAddSectionSequence();
        int sequence = scanner.nextInt();

        lineRepository.addSection(Line, newStation, sequence);
        view.printInfoOfAddSection();
    }

    private void deleteSection() {
        view.printDeleteSection();
        String Line = scanner.nextLine();
        view.printDeleteSectionLine();
        String Station = scanner.nextLine();

        lineRepository.deleteSection(Line, Station);
        view.printInfoOfDeleteSection();
    }
}
