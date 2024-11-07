package org.example;

import com.fasterxml.jackson.core.type.TypeReference;  // Import this
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonSerializer<T> implements Serializer<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Class<T> clazz;

    public JsonSerializer(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String serialize(T entity) throws IOException {
        return objectMapper.writeValueAsString(entity);
    }

    @Override
    public T deserialize(String data) throws IOException {
        return objectMapper.readValue(data, clazz);
    }

    @Override
    public void writeToFile(T entity, File file) throws IOException {
        objectMapper.writeValue(file, entity);
    }

    @Override
    public T readFromFile(File file) throws IOException {
        return objectMapper.readValue(file, clazz);
    }

    public void writeListToFile(Iterable<T> entityList, File file) throws IOException {
        objectMapper.writeValue(file, entityList);
    }

    public List<T> readListFromFile(File file) throws IOException {
        return objectMapper.readValue(file, new TypeReference<List<T>>() {});
    }
}
