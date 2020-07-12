package cn.qzl.www.Excetion_6.Interface.demo_2;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 21:33
 */
public class Test {
    public static void main(String[] args) {
        Geometry []geometry = new Geometry[2];
        geometry[0] = new Circle(5.2);
        geometry[1] = new Rectangular(2.3,6.5);

        Pillar p;

        for(Geometry g:geometry){
            p = new Pillar(g,5);
            System.out.print("底面积为："+g.GetArea());
            System.out.println("  体积为："+p.Volume());
        }
    }
}
