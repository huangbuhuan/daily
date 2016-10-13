package com.hbh.generic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import static com.hbh.generic.Tuple.*;

class MixinProxy implements InvocationHandler {
	Map<String, Object> delegatesByMeThod;
	public MixinProxy(TwoTuple<Object, Class<?>>...tuples ) {
		delegatesByMeThod = new HashMap<String, Object>();
		for(TwoTuple<Object, Class<?>> tuple : tuples) {
			for(Method method : tuple.second.getMethods()) {
				String methodName = method.getName();
				if(!delegatesByMeThod.containsKey(methodName)) {
					delegatesByMeThod.put(methodName, tuple.first);
				}
			}
		}
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		Object deleObject = delegatesByMeThod.get(methodName);
		return method.invoke(deleObject, args);
	}
	@SuppressWarnings("unchecked")
	public static Object newInstance(TwoTuple... tuples) {
		Class[] interfaces = new Class[tuples.length];
		for(int i = 0; i < tuples.length; i++) {
			interfaces[i] = (Class)tuples[i].second;
		}
		ClassLoader cl = tuples[0].first.getClass().getClassLoader();
		return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(tuples));
	}
	
}
public class DynamicProxyMixin {
	public static void main(String[] args) {
	}
}
