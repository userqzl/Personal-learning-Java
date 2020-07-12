package cn.qzl.www.Excetion_6.Interface.demo_2;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 21:30
 */
public class Rectangular implements Geometry{
    private double length;
    private double width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double GetArea(){
        return length*width;
    }
}
