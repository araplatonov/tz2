package benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Collection;

public class Main {
    @State(Scope.Thread)
    public static class BenchmarkState {
        int[] array;

        @Setup
        public void prepare() {
            array = new int[10];
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        }
    }
    public long sumArray(int[] array) {
        long sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    @Benchmark
    public void testSumArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumArray(array);
    }
    public static void main(String[] args) {
        Options opt = new OptionsBuilder()
                .include(org.example.Main.class.getSimpleName())
                .forks(1)
                .build();

        try {
            Runner runner = new Runner(opt);
            Collection<RunResult> result =  runner.run();
        } catch (Exception e) {}
    }
}
