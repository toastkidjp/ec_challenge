package jp.toastkid.ec_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * ���L�̂悤�ȕ�����̃R���N�V��������A�����̂ݒ��o���ĕʂ̕�����R���N�V��������肽���Ǝv���܂��B
 * []
 *
 * *** �o�͗�
 * [12345, 99234, 43156, 55324]
 *
 * @author Toast kid
 *
 */
public class Question5 {
    public static void main(final String[] args) {
        final List<String> strs = Arrays.asList("[A12345]", "[A99234]", "[A43156]", "[A55324]");

        final List<String> ints = new ArrayList<String>(strs.size());
        strs.stream().forEach(str -> {
            final StringBuilder sb = new StringBuilder(str.length());
            IntStream.range(0, str.length()).forEach(i -> {
                sb.append(Character.isDigit(str.charAt(i)) ? str.charAt(i) : "");
            });
            ints.add(sb.toString());
        });
        System.out.println(ints.toString());
    }
}
