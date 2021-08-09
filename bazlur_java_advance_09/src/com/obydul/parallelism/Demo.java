package com.obydul.parallelism;

import java.math.BigDecimal;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Demo {


	public static void main(String[] args) {
		List<Transaction> transactionList = FakeTransactionGenerator.generate(1_000_000);
		calculateTime(() -> processInSequential(transactionList), "Sequential Calculation: ", 1000);
		calculateTime(() -> processInParallel(transactionList), "Parallel Calculation: ", 1000);
	}
	
	public static BigDecimal processInParallel(List<Transaction> transactions) {
		return transactions.parallelStream().filter(Transaction::isCredit)
		.map(Transaction::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public static BigDecimal processInSequential(List<Transaction> transactions) {
		return transactions.stream().filter(Transaction::isCredit)
		.map(Transaction::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	

	public static void calculateTime(Supplier<BigDecimal> supplier, String name, int iteration) {
		System.out.println("starting : " + name);
		LongSummaryStatistics statistics = IntStream.range(0, iteration).mapToLong(value -> {
			long start = System.nanoTime();
			supplier.get();
			long duration = (System.nanoTime() - start);
			long msecs = duration / 1000_000;
			System.out.println("iteration: " + value + ", execution time : " + msecs);
			return msecs;
		}).summaryStatistics();
		System.out.println("Time to complete in " + name + " is: " + statistics.getAverage() + " msecs");
		System.out.println("maximum : " + statistics.getMax());
		System.out.println("minimum : " + statistics.getMin());
	}
}
