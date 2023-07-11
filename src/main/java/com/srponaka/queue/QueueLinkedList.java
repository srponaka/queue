package com.srponaka.queue;

public class QueueLinkedList {

	LinkedList list;

	// time complexity O(1)
	// spaceComplexity O(1)
	public QueueLinkedList() {
		list = new LinkedList();
		System.err.println("Queue is successfully created");
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public boolean isEmpty() {
		if (list.head == null) {
			return true;
		} else {
			return false;
		}
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public void enQueue(int value) {
		list.insertInLinkedList(++list.size, value);
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public int deQueue() {
		int res = -1;
		if (isEmpty()) {
			return res;
		}
		res = list.head.value;
		list.deleteANode(0);
		return res;
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public int peek() {
		int res = -1;
		if (isEmpty()) {
			return res;
		}
		return list.head.value;
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public void deleteNode() {
		list.head = list.tail = null;
	}

}
