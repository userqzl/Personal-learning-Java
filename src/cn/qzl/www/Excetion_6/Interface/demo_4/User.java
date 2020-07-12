package cn.qzl.www.Excetion_6.Interface.demo_4;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 10:55
 */
public interface User {
    public abstract void Send();    //短信
    public abstract void Call();    //通电话

    default void Music(){   //音乐

    }
    default void Video(){   //视频播放

    }
    default void Photo(){   //拍照

    }
    default void Internet(){    //上网

    }
}
