package com.hangdra.proxy.jdk;

import com.hangdra.proxy.Animal;
import com.hangdra.proxy.Cat;
import org.junit.Test;

public class MainClass {
    @Test
    public void dynamicProxy() throws Exception {
        Cat cat = new Cat();
        Animal proxy = (Animal) DynamicProxyAnimal.getProxy(cat);
        proxy.shit();
    }

}
