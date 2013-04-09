package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午3:08
 * Useage: 鸭子客户端模拟
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

//        mallardDuck.performQuack();
//        rubberDuck.performQuack();
//
//        decoyDuck.performFly();

        decoyDuck.setFlyBehavior(new FlyRocketPower());
        decoyDuck.performFly();
    }
}
