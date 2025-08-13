package Java_21;

/*
 Virtual Threads (JEP 444 — Final in Java 21):
 
Java 21 makes Virtual Threads a permanent feature (introduced as preview in Java 19 & 20).
They are lightweight threads managed by the JVM, designed to handle massive concurrency 
without the memory and scheduling overhead of traditional platform threads.

Key Points:

Platform Threads (old) → 1 Java thread maps to 1 OS thread → expensive.
Virtual Threads (new) → 1 Java thread is scheduled by JVM → super cheap to create and switch.
Still works with Runnable, ExecutorService, etc.
Not faster for CPU-heavy tasks — still good for I/O-heavy.
 */

public class VirtualThreads {
	public static void main(String[] args) throws InterruptedException {
		
		// Wit executor service
		try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskId + " running on " + Thread.currentThread());
                    Thread.sleep(1000); // simulate I/O
                    return null;
                });
            }
        } // executor auto-closes and waits for tasks
		
		// Quick Start without executor service
		Thread.startVirtualThread(() -> {
            System.out.println("Hello from: " + Thread.currentThread());
        }).join();
	}
}
