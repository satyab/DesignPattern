package creational.builder.builderrecursivegenerics;

public class PersonBuilder<T extends PersonBuilder<T>> {

    protected Person person = new Person();

    // critical to return T here
    public T withName(String name) {
        person.setName(name);
        return self();
    }

    protected T self() {
        // unchecked cast, but actually safe
        // proof: try sticking a non-PersonBuilder
        //        as SELF parameter; it won't work!
        return (T) this;
    }

    public Person build() {
        return person;
    }
}
