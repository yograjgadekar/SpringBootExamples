package java_Concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		executorInvoke();
		executorServiceInvoke();
	}

	private static void executorServiceInvoke() {
		Executor executor = new Caller();
		
		//Lambda function 
		executor.execute(() -> {
			System.out.println("Executor Example.");
		});
	}

	private static void executorInvoke() {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.submit(() -> {
			System.out.println("ExecutorService Example.");			
		});
		
	}
	
	

}
