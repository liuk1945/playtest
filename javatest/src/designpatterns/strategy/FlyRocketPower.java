package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午2:35
 * Useage:
 */
public class FlyRocketPower implements FlyBehavior {
    public void fly(){
        System.out.println("fly by Rocket power");
    }
}
