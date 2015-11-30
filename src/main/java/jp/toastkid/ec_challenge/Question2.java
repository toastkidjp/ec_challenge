package jp.toastkid.ec_challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

/**
 * @author Toast kid
 */
public class Question2 {
    public static void main(final String[] args) {
        final List<String> members
            = Arrays.asList("Hiroshi", "Yusuke", "Fumio", "Shotaro", "Tatsuya", "Sumire");
        final List<String> presents
            = Arrays.asList("Smart Phone", "PC", "Video Game", "Guitar", "Robot", "Media Player");
        final Queue<Integer> randoms = new LinkedBlockingQueue<>(members.size());
        IntStream.range(0, members.size()).forEach(i -> {
            int random = (int) (Math.random() * members.size());
            while (randoms.contains(random)) {
                random = (int) (Math.random() * members.size());
            }
            randoms.add(random);
        });
        members.stream().forEach(mem -> {
            System.out.println(
                    String.format("%s‚Í%s‚ğè‚É“ü‚ê‚Ü‚µ‚½I", mem, presents.get(randoms.poll())));
        });
    }
}
