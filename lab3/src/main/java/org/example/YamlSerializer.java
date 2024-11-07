package org.example;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fasterxml.jackson.core.type.TypeReference;  // Import this

import java.io.File;
import java.io.IOException;
import java.util.List;

public class YamlSerializer<T> implements Serializer<T> {
    private final YAMLMapper yamlMapper = new YAMLMapper();
    private final Class<T> clazz;

    public YamlSerializer(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String serialize(T entity) throws IOException {
        return yamlMapper.writeValueAsString(entity);
    }

    @Override
    public T deserialize(String data) throws IOException {
        return yamlMapper.readValue(data, clazz);
    }

    @Override
    public void writeToFile(T entity, File file) throws IOException {
        yamlMapper.writeValue(file, entity);
    }

    @Override
    public T readFromFile(File file) throws IOException {
        return yamlMapper.readValue(file, clazz);
    }

    public void writeListToFile(Iterable<T> entityList, File file) throws IOException {
        yamlMapper.writeValue(file, entityList);
    }

    public List<T> readListFromFile(File file) throws IOException {
        return yamlMapper.readValue(file, new TypeReference<List<T>>() {});
    }
}
