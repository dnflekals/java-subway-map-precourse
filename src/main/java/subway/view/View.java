package subway.view;

public class View {

    public void printMainMenu() {
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
        System.out.println("잘못된 값을 입력했습니다.");
        System.out.println("다시 입력해 주세요.");
    }
}
