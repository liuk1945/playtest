package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午2:41
 * Useage:
 */
public class Quack implements QuackBehavior {
    public void quack(){
        System.out.println("guaguagua with quack");
    }
}
