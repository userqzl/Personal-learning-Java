package cn.qzl.www.Excetion_6.Interface.demo_2;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 21:20
 */
public class Pillar{
    private double FloorSpace;
    private double height;

    public Pillar(Geometry geometry,double height) {
        this.FloorSpace = geometry.GetArea();
        this.height = height;
    }
    public double Volume(){
        return  FloorSpace*height;
    }

}
