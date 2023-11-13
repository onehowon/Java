import java.util.TreeSet;

public class treeSet2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to ="d";

        set.add("abc"); set.add("alien"); set.add("bat");

        System.out.println(set);

        System.out.println("result1:" + set.subSet(from, to));
    }
}
