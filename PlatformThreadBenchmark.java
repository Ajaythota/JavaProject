import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.time.Duration;
import java.time.Instant;

public class PlatformThreadBenchmark {


    public static void main(String [] args){
        Instant start = Instant.now();

        // Limited to 100 OS threads
        try (var executor = Executors.newFixedThreadPool(100)) {
            IntStream.range(0, 1_000).forEach(i -> {
                executor.submit(() -> {
                    // Simulate 1-second blocking I/O (e.g., API or DB call)
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        } // Auto-closes and waits for all tasks to finish

        Duration elapsed = Duration.between(start, Instant.now());
        // Takes ~10 seconds (1,000 tasks / 100 threads = 10 batches)
        System.out.println("Platform threads elapsed time: " + elapsed.toMillis() + " ms");


    }

}
