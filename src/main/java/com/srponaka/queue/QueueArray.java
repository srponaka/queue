package com.srponaka.queue;

public class QueueArray {

	int[] arr;
	int topOfQueue;
	int beginingOfQueue;

	// time complexity O(1)
	// spaceComplexity O(n)
	public QueueArray(int size) {
		this.arr = new int[size];
		this.beginingOfQueue = -1;
		this.topOfQueue = -1;
		System.err.println("Queue is created successfully");
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public boolean isFull() {
		if (topOfQueue == this.arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public boolean isEmpty() {
		if (beginingOfQueue == -1 || beginingOfQueue == arr.length) {
			return true;
		} else {
			return false;
		}
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public void enQueue(int value) {
		if (isFull()) {
			System.err.println("Queue is full");
		} else if (isEmpty()) {
			beginingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.err.println("Successfully inserted in Queue ");
		} else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.err.println("Successfully inserted in Queue ");
		}
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public int deQueue() {
		if (isEmpty()) {
			System.err.println("Queue is Empty");
			return -1;
		} else {
			int res = arr[beginingOfQueue];
			beginingOfQueue++;
			if (beginingOfQueue > topOfQueue) {
				this.beginingOfQueue = -1;
				this.topOfQueue = -1;
			}
			return res;
		}
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public int peek() {
		if (isEmpty()) {
			System.err.println("Queue is Empty");
			return -1;
		} else {
			return arr[beginingOfQueue];
		}
	}

	// time complexity O(1)
	// spaceComplexity O(1)
	public void delete() {
		if (isEmpty()) {
			System.err.println("Queue is Empty");
		} else {
			arr = null;
			System.err.println("Queue is successfully deleted");
		}
	}

}
