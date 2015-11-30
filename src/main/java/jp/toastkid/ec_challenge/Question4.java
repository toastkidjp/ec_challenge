package jp.toastkid.ec_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre>
 * バンドとJavaコミュニティ両方に所属: Hiroshi
 * バンドまたはJavaコミュニティに所属: Fumio, Sumire, Ken, Hiroshi, Irene, Yusuke
 * バンドのみ所属: Ken, Irene
 * Javaコミュニティのみ所属: Fumio, Sumire, Yusuke
 * </pre>
 * @author Toast kid
 *
 */
public class Question4 {

    public static void main(final String[] args) {
        final List<String> bandMembers = Arrays.asList("Ken", "Irene", "Hiroshi");
        final List<String> javaMembers = Arrays.asList("Fumio", "Sumire", "Yusuke", "Hiroshi");

        System.out.println("バンドとJavaコミュニティ両方に所属:"
                + bandMembers.stream().filter(bm -> {return javaMembers.contains(bm);})
                    .collect(Collectors.toList())
            );
        System.out.println("バンドまたはJavaコミュニティに所属:" + new ArrayList<String>(){{
            addAll(bandMembers);
            addAll(javaMembers);
        }});
        System.out.println("バンドのみ所属:"
                + bandMembers.stream().filter(bm -> {return !javaMembers.contains(bm);})
                .collect(Collectors.toList())
            );
        System.out.println("Javaコミュニティのみ所属:"
                + javaMembers.stream().filter(bm -> {return !bandMembers.contains(bm);})
                .collect(Collectors.toList())
            );
    }
}
