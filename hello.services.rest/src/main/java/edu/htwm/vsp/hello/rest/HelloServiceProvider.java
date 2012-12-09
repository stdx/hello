package edu.htwm.vsp.hello.rest;

import java.lang.reflect.Type;

import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.core.spi.component.ComponentScope;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.InjectableProvider;

import edu.htwm.vsp.hello.service.SayHello;
import edu.htwm.vsp.hello.service.impl.SayHelloInFrench;

@Provider
public class HelloServiceProvider implements InjectableProvider<Context, Type>, Injectable<SayHello> {

	@Override
	public Injectable<SayHello> getInjectable(ComponentContext ic, Context a, Type c) {
		if(SayHello.class.equals(c))
			return this;
		else
			return null;
	}

	@Override
	public ComponentScope getScope() {
		return ComponentScope.Singleton;
	}

	@Override
	public SayHello getValue() {
		return new SayHelloInFrench();
	}

}
