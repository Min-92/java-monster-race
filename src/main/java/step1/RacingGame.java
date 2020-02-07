package step1;

import java.util.Random;

public class RacingGame {
    int monsterNumber;

    public RacingGame(int monsterNumber) {
        this.monsterNumber = monsterNumber;
    }

    public void racing(int trialNumber) {
        System.out.println("< 실행 결과 >");
        String[] monster = new String[monsterNumber];

        for (String moveResult : monster) {
            moveResult = getMoveResult(trialNumber);
            System.out.println(moveResult);
        }
    }

    public String getMoveResult(int trialNumber) {
        String moveResult = "";
        for (int j = 0; j < getMoveCnt(trialNumber); j++) {
            moveResult += "-";
        }

        return moveResult;
    }

    public int getMoveCnt(int trialNumber) {
        int moveCnt = 0;

        for (int i = 0; i < trialNumber; i++) {
            moveCnt += checkMove();
        }

        return moveCnt;
    }

    public int checkMove() {
        Random rd = new Random();
        int random = rd.nextInt(10);
        int move = 0;

        if (!(random >= 4)) return 0;
        move++;

        return move;
    }
}

