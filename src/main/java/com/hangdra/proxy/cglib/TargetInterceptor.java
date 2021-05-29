package com.hangdra.proxy.cglib;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

public class TargetInterceptor implements net.sf.cglib.proxy.MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB 调用前");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("CGLIB 调用后");
        return result;

    }
}
