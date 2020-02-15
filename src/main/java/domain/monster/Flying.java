package domain.monster;

public class Flying extends Monster {

  private final int FORWARD_CONDITION = 6;
  private final int FLYING_BONUS = 3;

  public Flying(String name) {
    super(name);
  }


  @Override
  public void forward() {
    if (steps.isEmpty()) {
      return;
    }
    if (steps.pop() >= FORWARD_CONDITION) {
      step += (FORWARD * FLYING_BONUS);
    }
    forward();
  }

  @Override
  public String toString() {
    return this.name + " " + "[비행]";
  }
}
