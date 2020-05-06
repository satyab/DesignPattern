package creational.builder.builderrecursivegenerics;

public class Demo {

    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder()
            .withName("Satyajit")
            .worksAs("Developer");
        System.out.println(eb.build());
    }
}
