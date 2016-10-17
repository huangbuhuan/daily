package com.hbh.generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Apply {
	public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args){
		try {
			for(T t : seq) {
				f.invoke(t, args);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
class Shape {
	public void rotate() {
		System.out.println(this + " rotate");
	}
	public void resize(int newSize) {
		System.out.println(this + " resize " + newSize);
	}
}
class Square extends Shape {
	
}
class FilledList<T> extends ArrayList<T> {
	public FilledList(Class<? extends T> type, int size) {
		try {
			for(int i = 0; i < size; i++) {
				add(type.newInstance());
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
class ApplyTest{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		List<Shape> shapes = new ArrayList<Shape>();
		for(int i = 0; i < 10; i++) {
			shapes.add(new Shape());
		}
		Apply.apply(shapes, Shape.class.getMethod("rotate"));
		Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);
		List<Square> squares = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			squares.add(new Square());
		}
		Apply.apply(squares, Square.class.getMethod("rotate"));
		Apply.apply(squares, Square.class.getMethod("resize"), 5);
	}
}