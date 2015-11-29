package toastkidjp.ec_challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Toast kid
 */
public class Question3 {

    public static void main(final String[] args) {
        final List<Integer> list = new ArrayList<>(1_000_000);
        IntStream.range(1, 1_000_000).forEach(i -> list.add(i));

        final List<List<Integer>> lists = new ArrayList<>();
        int index = 0;
        while (index < list.size()) {
            final List<Integer> splited = new ArrayList<>();
            final int lastIndex = Math.min(index + 2_000, list.size() + 1);
            IntStream.range(index, lastIndex).forEach(i -> splited.add(i));
            lists.add(splited);
            index = lastIndex;
        }
        lists.stream().forEach(l -> System.out.println(l));
    }
}
