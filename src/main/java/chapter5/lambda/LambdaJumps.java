package chapter5.lambda;

import java.util.function.Consumer;

/**
 * Created by hadeslee on 2017-05-16.
 */
public class LambdaJumps {
    public static void main(String[] args) {
        Consumer<int[]> printer = ids -> {
            int printedCount = 0;
            for (int id : ids) {
                if (id % 2 != 0) {
                    continue;
                }
                System.out.println(id);
                printedCount++;
// Break out of the loop after printing 3 ids
                if (printedCount == 3) {
                    break;
                }
            }
        };
// Print an array of 8 integers
        printer.accept(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}
