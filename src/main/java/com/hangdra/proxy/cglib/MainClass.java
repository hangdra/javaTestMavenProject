package com.hangdra.proxy.cglib;

import com.hangdra.proxy.Animal;
import com.hangdra.proxy.Cat;
import net.sf.cglib.core.DebuggingClassWriter;
import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {

    @Test
    public void dynamicProxy() throws Exception {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, CglibProxy.class.getResource("/").getPath());
//        System.out.println(CglibProxy.class.getResource("/").getPath());
//        URL xmlpath = CglibProxy.class.getClassLoader().getResource("");
//        System.out.println(xmlpath);

        Animal cat = (Animal) CglibProxy.getProxy(Cat.class);
        cat.shit();
        Integer end = 1000000;
//        IntStream finalResult =
        List<Integer> finalResult = new ArrayList<>();
//        IntStream.range(0,end).parallel().filter(s->s%2==0).map(s -> finalResult.add(s));
        List<Integer> evens = IntStream.range(0,end).filter(num -> num % 2 == 0).boxed().collect(Collectors.toList());

//        List<Integer> num1 = (List<Integer>) IntStream.range(0,end).parallel().map(n->n*2).collect(Collectors.toList());
        List<Integer> finalResult2 = new ArrayList<>();
//        List<Integer> finalResult = result;
        IntStream.range(0,end).filter(s->s%2==0).boxed().forEach(s-> finalResult2.add(s));

        System.out.println(evens.size());
        System.out.println(finalResult2.size());
        System.out.println(IntStream.range(0,10).boxed().collect(Collectors.toList()));
    }




}
