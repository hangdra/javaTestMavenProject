package com.hangdra.com.hangdra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class threadLocaltest {
    public static ThreadLocal<String> tl = new ThreadLocal();

    public static void main(String[] a){
        List<ThreadLocal> list = new ArrayList<ThreadLocal>();
        for(int i = 0 ; i<30 ; i++){
            ThreadLocal<String> tltemp = new ThreadLocal();
            tltemp.set("ok fine hangdra"+i);
            list.add(tltemp);
        }
        for(ThreadLocal one:list){
            System.out.println(one.get());
        }
    }
}
