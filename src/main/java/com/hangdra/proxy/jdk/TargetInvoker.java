package com.hangdra.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TargetInvoker implements InvocationHandler {

    private Object obj;

    public TargetInvoker (Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk 代理执行前");
        Object result = method.invoke(obj, args);
        System.out.println("jdk 代理执行后");
        return result;

    }
}
