package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午2:36
 * Useage:
 */
public class FlyWithWings implements FlyBehavior {
    public void fly(){
        System.out.println("fly with wings");
    }
}
