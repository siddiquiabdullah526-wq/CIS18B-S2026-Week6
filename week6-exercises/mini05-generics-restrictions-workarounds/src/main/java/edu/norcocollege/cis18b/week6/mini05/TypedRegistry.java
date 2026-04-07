package edu.norcocollege.cis18b.week6.mini05;

import java.util.HashMap;
import java.util.Map;

public class TypedRegistry {

    private final Map<String, Object> values = new HashMap<>();

    public <T> void put(String key, T value) {
        values.put(key, value);
    }

    public <T> T get(String key, Class<T> token) {
        Object value = values.get(key);
        return token.cast(value);
    }
}
