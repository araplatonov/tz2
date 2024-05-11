package benchmarks;

import org.example.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.ArrayList;
import java.util.Collection;

public class BenchmarkMain {
    @Benchmark
    public void sum_10() {
        ArrayList<Long> arr = new ArrayList<Long>();

        for(int i = 0; i < 10; i++) {
            arr.add( (long)(Math.random() * 50 + 1) );
        }

        Main._sum(arr);
    }

    @Benchmark
    public void sum_100() {
        ArrayList<Long> arr = new ArrayList<Long>();

        for(int i = 0; i < 100; i++) {
            arr.add( (long)(Math.random() * 50 + 1) );
        }

        Main._sum(arr);
    }

    @Benchmark
    public void sum_1000() {
        ArrayList<Long> arr = new ArrayList<Long>();

        for(int i = 0; i < 1000; i++) {
            arr.add( (long)(Math.random() * 50 + 1) );
        }

        Main._sum(arr);
    }

    @Benchmark
    public void sum_10000() {
        ArrayList<Long> arr = new ArrayList<Long>();

        for(int i = 0; i < 10000; i++) {
            arr.add( (long)(Math.random() * 50 + 1) );
        }

        Main._sum(arr);
    }

    public static void main(String[] args) {
        Options opt = new OptionsBuilder()
                .include(BenchmarkMain.class.getSimpleName())
                .warmupIterations(2)
                .measurementIterations(2)
                .warmupTime(TimeValue.seconds(2))
                .measurementTime(TimeValue.seconds(2))
                .forks(1)
                .build();

        try {
            Runner runner = new Runner(opt);
            Collection<RunResult> result =  runner.run();
        } catch (Exception e) {}
    }
}
