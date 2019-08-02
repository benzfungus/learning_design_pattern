package strategy_pattern;

public class Duckcall {
    private QuackBehavior quackBehavior;
    
    public Duckcall() {
        quackBehavior = new Quack();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
