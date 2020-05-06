package creational.builder.stringbuilder;

public class StringBuilderExample {

    public static void main(String[] args) {

        withoutBuilder();
        withBuilder();
    }

    public static void withoutBuilder() {
        String[] words = {"hello", "world"};
        String s = "";
        s += "<ul>\n";
        for (String word : words) {
            s += String.format(" <li>%s</li>\n", word);
        }
        s += "</ul>\n";

        System.out.println(s);
    }

    public static void withBuilder() {
        String[] words = {"hello", "world"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words) {
            sb.append(String.format(" <li>%s</li>\n", word));
        }
        sb.append("</ul>\n");

        System.out.println(sb);
    }
}
