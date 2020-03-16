package com.java.eight.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ExampleForEach {

	public static void main(String[] args) {

		// Creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}

		// Traversing using Iterator
		Iterator<Integer> iterator = myList.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println("Iterator Value: " + i);
		}

		// traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class value:: " + t);
			}
		});

		MyConsumer action = new MyConsumer();
		myList.forEach(action);
	}

}

class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);
	}

}
