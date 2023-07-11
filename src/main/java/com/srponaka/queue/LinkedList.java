package com.srponaka.queue;

public class LinkedList {

	public Node head;
	public Node tail;
	public int size;

	public Node createSinglyLinkedList(int value) {
		head = new Node();
		Node node = new Node();
		node.value = value;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertInLinkedList(int location, int value) {
		Node node = new Node();
		node.value = value;
		if (head == null) {
			createSinglyLinkedList(value);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			tail.next = node;
			tail = node;
			tail.next = null;
		} else {
			Node temp = head;
			int index = 0;
			while (index < location - 1) {
				temp = temp.next;
				index++;
			}
			Node next = temp.next;
			temp.next = node;
			node.next = next;
		}
		size++;
	}

	public void deleteANode(int location) {
		if (head == null) {
			System.err.println("Linked list is empty");
			return;
		} else if (location == 0) {
			head = head.next;
			size--;
		} else if (location >= size) {
			Node temp = head;
			for (int i = 0; i < size - 1; i++) {
				temp = temp.next;
			}
			if (temp == head) {
				tail = head = null;
				size--;
				return;
			}
			temp.next = null;
			tail = temp;
		} else {
			Node temp = head;
			for (int i = 0; i < location - 1; i++) {
				temp = temp.next;
			}
			if (temp == head) {
				tail = head = null;
				size--;
				return;
			}
			temp.next = null;
			tail = temp;
		}
		size--;
	}
}
