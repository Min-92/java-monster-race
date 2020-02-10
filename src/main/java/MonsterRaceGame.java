import java.util.Scanner;

public class MonsterRaceGame {
    public static void main(String[] args) {
        System.out.println("<스릴만점 건전한 몬스터 경주>");

        InputHandler inputHandler = new InputHandler(new Scanner(System.in));
        int trialNumber = inputHandler.getTrials();
        int monsterNumber = inputHandler.getMonsterNumber();

        Status status = new Status();
        System.out.println("<실행 결과>");
        System.out.println(status.showStatus(monsterNumber, trialNumber));
    }
}