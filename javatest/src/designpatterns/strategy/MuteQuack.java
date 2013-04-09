package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午2:40
 * Useage:
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("Mute Quack");
    }
}
