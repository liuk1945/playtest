package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午2:32
 * Useage:
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("can not fly");
    }
}
