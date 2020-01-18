package com.giacomini.andrea.chapter1.creatingAndDestroyingObjects;

// A builder for objects of type T
public interface BuilderInterface<T> 
{
	public T build(); 
}