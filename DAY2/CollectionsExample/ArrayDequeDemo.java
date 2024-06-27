package DAY2.CollectionsExample;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		Deque<Integer> deck = new ArrayDeque<Integer>();
		deck.addFirst(5);
		deck.addFirst(10);
		System.out.println("Deque After Inserting using addFirst(): " + deck);

		deck.offerFirst(15);
		deck.offerFirst(20);
		System.out.println("Deque After Inserting using offerFirst(): " + deck);

		deck.addLast(25);
		deck.addLast(30);
		System.out.println("Deque After Inserting using addLast(): " + deck);

		deck.offerLast(35);
		deck.offerLast(40);
		System.out.println("Deque After Inserting using offerLast(): " + deck);
	}
}