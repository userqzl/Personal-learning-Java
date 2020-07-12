package cn.qzl.www.Excetion_6.Interface.demo_6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 14:58
 */
public class StringArrays implements Comparator<String> {
    @Override
    public int compare(String first,String second){
        return first.length() - second.length();
    }

    public void sort(String []strings){
        for(int i = 0;i < strings.length;++i){
            for(int j = 0;j < strings.length-1-i;++j){
                if(compare(strings[j],strings[j+1])>0){
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }
    }

        public static void main(String[] args) {
            String []strings = {"aaaaa","baaa","caaaaaaaa","da","e","faaaaaaa","gaaaaaa"};
            System.out.println("排序前： ");
            for(String s:strings)
                System.out.print(s+" ");
            System.out.println();

            System.out.println("排序后： ");
            StringArrays s = new StringArrays();
            s.sort(strings);
            for(String s2:strings)
                System.out.print(s2+" ");
        /*
        System.out.println("使用Arrarys排序后");
        Arrays.sort(strings);
        for(String s2:strings)
            System.out.print(s2+" ");

         */
    }
}
