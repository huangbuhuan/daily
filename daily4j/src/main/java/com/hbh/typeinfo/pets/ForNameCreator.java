package com.hbh.typeinfo.pets;


import java.rmi.server.LoaderHandler;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class ForNameCreator extends PetCreator{

	private static List<Class<? extends Pet>> types = 
			new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames = {
			"com.hbh.typeinfo.pets.Mutt",
			"com.hbh.typeinfo.pets.Pug",
			"com.hbh.typeinfo.pets.EgyptianMau",
			"com.hbh.typeinfo.pets.Manx",
			"com.hbh.typeinfo.pets.Cymric",
			"com.hbh.typeinfo.pets.Rat",
			"com.hbh.typeinfo.pets.Mouse",
			"com.hbh.typeinfo.pets.Hamster"
	};
	
	@SuppressWarnings("unchecked")
	private static void load() {
		try {
			for(String name : typeNames) {
				types.add((Class<? extends Pet>)Class.forName(name));
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	static {
		load();
	}
	
	@Override
	public List<Class<? extends Pet>> types() {
		return null;
	}
	

}
