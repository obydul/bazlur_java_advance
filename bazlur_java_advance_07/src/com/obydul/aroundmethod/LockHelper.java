package com.obydul.aroundmethod;

import java.util.concurrent.locks.Lock;

public class LockHelper {
	public static void withLock(Lock lock, VoidBusinessCode businessCode) {
		lock.tryLock();
		try {
			businessCode.apply();
		} finally {
			lock.unlock();
		}
	}
	

	public static int withLock(Lock lock, IntegerBusinessCode intBusinessCode) {
		lock.tryLock();
		try {
		 return	intBusinessCode.apply();
		} finally {
			lock.unlock();
		}
	}

}
