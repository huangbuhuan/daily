package com.hbh.container;

import org.omg.CORBA.ARG_IN;

public class Individual implements Comparable<Individual>{
	private static long counter = 0;
	private final long id = counter++;
	private String name;
	public Individual(String name) {
		this.name = name;
	}
	public Individual() {
		
	}
	public String toString() {
		return getClass().getSimpleName() + (name == null ? "" : " " +name);
	}
	public long id() {
		return id;
	}
	public boolean equals(Object o) {
		return o instanceof Individual &&
				id == ((Individual)o).id;
	}
	public int hashCode() {
		int result = 17;
		if(name != null) {
			result = 37*result + name.hashCode();
		}
		result = 37*result + (int)id;
		return result;
	}
	@Override
	public int compareTo(Individual o) {
		String first = getClass().getSimpleName();
		String argFirst = o.getClass().getSimpleName();
		int firstCompare = first.compareTo(argFirst);
		if(firstCompare !=0) {
			return firstCompare;
		}
		if(name != null && o.name != null) {
			int secendCompare = name.compareTo(o.name);
			if(secendCompare != 0) {
				return secendCompare;
			}
		}
		return (o.id < id ? -1 : (o.id == id ? 0 :1));
	}

}
