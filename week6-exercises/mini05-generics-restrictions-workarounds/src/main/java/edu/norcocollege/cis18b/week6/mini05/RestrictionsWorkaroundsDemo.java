package edu.norcocollege.cis18b.week6.mini05;

public class RestrictionsWorkaroundsDemo {

    public static void main(String[] args) {
        TypedRegistry registry = new TypedRegistry();
        registry.put("retries", 3);
        registry.put("status", "NEW");

        FactoryBox<String> messageFactory = new FactoryBox<>(() -> "Welcome");

        System.out.println("Default retries: " + registry.get("retries", Integer.class));
        System.out.println("Default status: " + registry.get("status", String.class));
        System.out.println("Created message: " + messageFactory.create());
    }
}
