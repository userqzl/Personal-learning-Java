package cn.qzl.www.Excetion_6.Interface.demo_1;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 20:29
 */
public class Test {
    public static void main(String[] args) {
        Animal []animal = new Animal[3];
        animal[0] = new Dog("旺财");
        animal[1] = new Cat("黑猫");
        animal[2] = new Bird("麻雀");

        for(Animal a : animal){
            System.out.print( a.toString()+" ");
            if(a instanceof Dog) ((Dog) a).LookHome();
            if(a instanceof Cat) ((Cat) a).CatchMouse();
            if(a instanceof Bird) ((Bird) a).CatchWorm();
        }

    }
}
