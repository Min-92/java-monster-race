package dev.solar;

import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.IntStream;

abstract class Monster {
    private String monsterName;
    private MonsterType monsterType;
    private int minCriteria;
    protected int forwardCount;
    protected int forwardPosition;

    public Monster(String monsterName, String monsterType) {
            this.monsterName = monsterName;
            this.monsterType = MonsterType.valueOfType(monsterType);
            this.minCriteria = this.monsterType.getMinCriteria();
            this.forwardPosition = 0;
    }

    abstract void setForwardCount();

    public int getForwardPosition() {
        return forwardPosition;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void move() {
        if (isAboveMinCriteria()) {
            forwardPosition += forwardCount;
        }
    }

    public boolean isAboveMinCriteria() {
        int randomValue = new Random().nextInt(10) + 1;
        return randomValue >= minCriteria;
    }

    @Override
    public String toString() {
        String prefix = String.format("%s [%s]", monsterName, monsterType.getMonsterTypeName());
        StringJoiner strJoiner = new StringJoiner("-", prefix, "*");
        IntStream.rangeClosed(0, forwardPosition).forEach(i -> strJoiner.add(""));
        return strJoiner.toString();
    }
}
