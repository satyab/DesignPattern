package creational.builder.facetedbuilder;

public class Demo {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
            .lives()
            .at("Waghbil")
            .in("Thane")
            .withPostcode("400615")
            .works()
            .at("Microsoft")
            .asA("Engineer")
            .earning(123000)
            .build();
        System.out.println(person);
    }
}