package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午2:38
 * Useage:
 */
public class SQuack implements QuackBehavior {
    public void quack(){
        System.out.println("gua gua gua squack");
    }
}
