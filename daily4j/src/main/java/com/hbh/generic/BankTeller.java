package com.hbh.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class BankTeller {
	public static void serve(Teller teller, Customer customer) {
		System.out.println(teller + " " + customer);
	}
	public static void main(String[] args) {
		Random random = new Random(47);
		Queue<Customer> customers = new LinkedList<Customer>();
		Generators.fill(customers, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator(), 4);
		for (Customer customer : customers) {
			serve(tellers.get(random.nextInt(tellers.size())), customer);
		}
	}
}
class Teller {
	private static long counter = 1;
	private final long id = counter++;
	private Teller(){
		
	}
	public String toString() {
		return "Teller: " + id;
	}
	public static Generator<Teller> generator() {
		return new Generator<Teller>(){

			@Override
			public Teller next() {
				return new Teller();
			}
			
		};
	}
}
class Customer {
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {
		
	}
	public String toString() {
		return "Customer: " + id;
	}
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			
			@Override
			public Customer next() {
				return new Customer();
			}
		};
	}
}
