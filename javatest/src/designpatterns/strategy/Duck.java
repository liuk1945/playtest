package designpatterns.strategy;

/**
 * User: michael
 * Date: 12-11-27
 * Time: 下午2:28
 * Useage: 鸭子的抽象类，定义了鸭子的具有的各种行为特征
 */
public abstract class Duck {
    FlyBehavior flyBehavior; //每种鸭子飞行的行为都是不一样的，但是可以被归纳
    QuackBehavior quackBehavior; //同上

    public Duck(){
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 每一种鸭子的形态各异，留给各个实现类去实现
     */
    public void display(){

    }

    /**
     * 每一种鸭子都具有游泳功能
     */
    public void swim(){
        System.out.println("we all can swin");
    }
}
