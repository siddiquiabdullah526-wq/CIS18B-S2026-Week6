package edu.norcocollege.cis18b.week6.mini05;

public class RestrictionsWorkaroundsDemo {

    public static void main(String[] args) {
        TypedRegistry registry = new TypedRegistry();

        // Primitive type arguments are not allowed in generics, that's why Integer is used instead of int
        registry.put("retries", 3);
        registry.put("status", "NEW");

        // supplier-based creation is used instead of illegal code
        FactoryBox<String> messageFactory = new FactoryBox<>(() -> "Welcome");

        // Class<T> tokens support safe lookup from stored objects,
        // while Supplier<T> is useful when creating new typed values.
        System.out.println("Default retries: " + registry.get("retries", Integer.class));
        System.out.println("Default status: " + registry.get("status", String.class));
        System.out.println("Created message: " + messageFactory.create());
    }
}

