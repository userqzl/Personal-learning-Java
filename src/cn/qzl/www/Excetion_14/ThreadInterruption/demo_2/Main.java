package cn.qzl.www.Excetion_14.ThreadInterruption.demo_2;/** * @Author qzl * @Description * 设置标志位中断线程 * @Since 2020-05-04 18:23 */public class Main {    public static void main(String[] args) throws InterruptedException{        HelloThread t = new HelloThread();        t.start();        Thread.sleep(10);        t.running = false;    }}