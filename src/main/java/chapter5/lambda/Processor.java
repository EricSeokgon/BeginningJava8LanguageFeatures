package chapter5.lambda;

/**
 * Created by hadeslee on 2017-05-05.
 */
@FunctionalInterface
public interface Processor {
    <T> void process(T[] list);
}