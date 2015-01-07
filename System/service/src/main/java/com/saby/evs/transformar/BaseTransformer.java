package com.saby.evs.transformar;

public interface BaseTransformer<A,B> {
	public A syncToDomain (A domain,B dto);
	public B syncToDto (A domain,B dto);
}
