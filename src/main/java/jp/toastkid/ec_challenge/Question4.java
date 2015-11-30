package jp.toastkid.ec_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre>
 * �o���h��Java�R�~���j�e�B�����ɏ���: Hiroshi
 * �o���h�܂���Java�R�~���j�e�B�ɏ���: Fumio, Sumire, Ken, Hiroshi, Irene, Yusuke
 * �o���h�̂ݏ���: Ken, Irene
 * Java�R�~���j�e�B�̂ݏ���: Fumio, Sumire, Yusuke
 * </pre>
 * @author Toast kid
 *
 */
public class Question4 {

    public static void main(final String[] args) {
        final List<String> bandMembers = Arrays.asList("Ken", "Irene", "Hiroshi");
        final List<String> javaMembers = Arrays.asList("Fumio", "Sumire", "Yusuke", "Hiroshi");

        System.out.println("�o���h��Java�R�~���j�e�B�����ɏ���:"
                + bandMembers.stream().filter(bm -> {return javaMembers.contains(bm);})
                    .collect(Collectors.toList())
            );
        System.out.println("�o���h�܂���Java�R�~���j�e�B�ɏ���:" + new ArrayList<String>(){{
            addAll(bandMembers);
            addAll(javaMembers);
        }});
        System.out.println("�o���h�̂ݏ���:"
                + bandMembers.stream().filter(bm -> {return !javaMembers.contains(bm);})
                .collect(Collectors.toList())
            );
        System.out.println("Java�R�~���j�e�B�̂ݏ���:"
                + javaMembers.stream().filter(bm -> {return !bandMembers.contains(bm);})
                .collect(Collectors.toList())
            );
    }
}
