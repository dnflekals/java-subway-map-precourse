package subway.view;

public class View {

    public void printMainMenu() {
        System.out.println();
        System.out.println("### 메인 화면");
        System.out.println("1. 역 관리");
        System.out.println("2. 노선 관리");
        System.out.println("3. 구간 관리");
        System.out.println("4. 지하철 노선도 관리");
        System.out.println("Q. 종료");
        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
    }

    public void printErrorOfMainTask() {
        System.out.println();
        System.out.println("잘못된 값을 입력했습니다.");
        System.out.println("다시 입력해 주세요.");
    }

    public void printStationMenu() {
        System.out.println();
        System.out.println("###역 관리 화면");
        System.out.println("1. 역 등록");
        System.out.println("2. 역 삭제");
        System.out.println("3. 역 조회");
        System.out.println("B. 돌아가기");
        System.out.println();
        System.out.println("###원하는 기능을 선택하세요.");
    }

    public void printAddStation(){
        System.out.println();
        System.out.println("등록할 역 이름을 입력하세요.");
    }

    public void printInfoOfAdd(){
        System.out.println();
        System.out.println("[INFO] 지하철 역이 등록되었습니다.");
    }

    public void printDeleteStation(){
        System.out.println();
        System.out.println("삭제할 역 이름을 입력하세요.");
    }

    public void printInfoOfDelete(){
        System.out.println();
        System.out.println("[INFO] 지하철 역이 삭제되었습니다.");
    }

    public void printListOfStation(){
        System.out.println();
        System.out.println("### 역 목록");
    }

    public void printLineMenu() {
        System.out.println();
        System.out.println("###노선 관리 화면");
        System.out.println("1. 노선 등록");
        System.out.println("2. 노선 삭제");
        System.out.println("3. 노선 조회");
        System.out.println("B. 돌아가기");
        System.out.println();
        System.out.println("###원하는 기능을 선택하세요.");
    }
}
