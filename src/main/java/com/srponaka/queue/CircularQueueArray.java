package com.srponaka.queue;

public class CircularQueueArray {

	int arr[];
	int topOfQueue;
	int beginingOfQueue;
	int size;

	// time complexity =O(1)
	// space complexity = O(n)
	public CircularQueueArray(int size) {
		this.arr = new int[size];
		this.size = size;
		this.beginingOfQueue = -1;
		this.topOfQueue = -1;
		System.err.println("Circular queue is created successfully");
	}

	// time complexity =O(1)
	// space complexity = O(1)
	public boolean isEmpty() {
		if (topOfQueue == -1) {
			return true;
		} else {
			return false;
		}
	}

	// time complexity =O(1)
	// space complexity = O(1)
	public boolean isFull() {
		if (topOfQueue + 1 == beginingOfQueue) {
			return true;
		} else if (beginingOfQueue == 0 && topOfQueue + 1 == size) {
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
			if (topOfQueue + 1 == size) {
				topOfQueue = 0;
			} else {
				topOfQueue++;
			}
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
			arr[beginingOfQueue] = 0;
			if (topOfQueue == beginingOfQueue) {
				topOfQueue = beginingOfQueue = -1;
			} else if (beginingOfQueue + 1 == size) {
				beginingOfQueue = 0;
			} else {
				beginingOfQueue++;
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
	public void deleteQueue() {
		arr = null;
		System.err.println("Queue is Deleted Successfully");
	}

}
