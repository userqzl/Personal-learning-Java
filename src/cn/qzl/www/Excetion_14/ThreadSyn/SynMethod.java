package cn.qzl.www.Excetion_14.ThreadSyn;import java.util.Random;/** * @Author qzl * @Description * 使用同步方法实现同步 * @Since 2020-05-05 18:17 */public class SynMethod implements Runnable{    private int ticket = 100;    Object obj = new Object();    @Override    public void run() {        Random random = new Random();        while (ticket>0) {            SellTicket();            try {                Thread.sleep(random.nextInt(10));            } catch (InterruptedException e) {                e.printStackTrace();            }        }    }    //使用同步方法实现对临界区资源的访问控制    public synchronized void SellTicket(){        if (ticket > 0) {            //System.out.println(Thread.currentThread().getName() + "正在出售" + ticket--);            ticket--;        }    }    public static void main(String[] args) {        Runnable r = new SynMethod();        Thread t1 = new Thread(r);        Thread t2 = new Thread(r);        Thread t3 = new Thread(r);        Thread t4 = new Thread(r);        Thread t5 = new Thread(r);        t1.start();        t2.start();        t3.start();        t4.start();        t5.start();    }}