package cn.qzl.www.Excetion_6.Interface.demo_2;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 21:27
 */
public class Circle implements Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double GetArea() {
        return 3.14 * radius * radius;
    }
}
