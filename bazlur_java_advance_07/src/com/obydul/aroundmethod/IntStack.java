package com.obydul.aroundmethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.obydul.aroundmethod.LockHelper.withLock;

public class IntStack {
	private Integer[] elements = new Integer[16];
	private Lock lock = new ReentrantLock();
	private int size = -1;

	public void push(Integer value) {
		lock.tryLock();
		try {
			if (size++ >= elements.length) {
				resize();
			}
			elements[size] = value;
		} finally {
			lock.unlock();
		}
	}

	public int pop() {
		lock.tryLock();
		try {
			Integer e = elements[--size];
			elements[size] = null;
			return e;
		} finally {
			lock.unlock();
		}
	}

	public void push2(Integer value) {
		withLock(lock, () -> {
			if (size++ >= elements.length) {
				resize();
			}
			elements[size] = value;

		});

	}

	public int pop2() {
		return withLock(lock, () -> {
			Integer e = elements[--size];
			elements[size] = null;
			return e;
		});
	}

	private void resize() {

	}

}
