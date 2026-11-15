import  java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class VirtualThreadsBenchmark {

    public static void main (String [] args) {
//The underscore (_) is a visual separator introduced in Java 7.
// It makes large numbers easier for humans to read without
// changing the actual value of the number.


        int taskCount=10000;
        // 1. Platform Threads (Fixed Pool of 100)
        Instant startPlatform = Instant.now();
        runTasks(Executors.newFixedThreadPool(100), taskCount);
        Duration platformDuration = Duration.between(startPlatform, Instant.now());
        System.out.println("Platform Threads (Pool of 100) took: " + platformDuration.toMillis() + " ms");

        // 2. Virtual Threads (One Virtual Thread per Task)
        Instant startVirtual = Instant.now();
        runTasks(Executors.newVirtualThreadPerTaskExecutor(), taskCount);
        Duration virtualDuration = Duration.between(startVirtual, Instant.now());
        System.out.println("Virtual Threads took: " + virtualDuration.toMillis() + " ms");


    }

    private static void runTasks(ExecutorService executor, int taskCount) {
        // ExecutorService implements AutoCloseable since Java 19
        try (executor) {
            IntStream.range(0, taskCount).forEach(i -> {
                executor.submit(() -> {
                    // Simulate a 1-second blocking I/O call
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        } // Automatically waits for all submitted tasks to complete
    }


}
