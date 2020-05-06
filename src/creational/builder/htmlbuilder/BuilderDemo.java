package creational.builder.htmlbuilder;

public class BuilderDemo {

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        System.out.println(builder);

        // fluent builder
        builder.clear();
        builder.addChildFluent("li", "hello")
            .addChildFluent("li", "world");
        System.out.println(builder);


    }
}
