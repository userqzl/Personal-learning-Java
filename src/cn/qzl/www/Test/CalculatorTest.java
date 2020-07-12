package cn.qzl.www.Test;


import cn.qzl.www.Core_2.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * Calculator单元测试
 * @author: qzl
 * @created: 2020/07/08 21:46
 */

public class CalculatorTest {

    //初始化方法，在测试时申请资源，注解@Before，该方法会自动首先执行
    @Before
    public void init(){
        System.out.println("初始化方法init执行，申请资源");
    }

    //close方法，在测试最后执行，注解@After，该方法自动最后执行，一般用于资源释放
    @After
    public void close(){
        System.out.println("close方法执行，释放资源成功！");
    }

    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1,2);
        //System.out.println("result = " + result);
        System.out.println("testAdd执行");

        //断言结果是3
        Assert.assertEquals(3,result);
    }
}
