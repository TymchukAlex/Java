package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.core.type.TypeReference;  // Import this

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlSerializer<T> implements Serializer<T> {
    private final XmlMapper xmlMapper = new XmlMapper();
    private final Class<T> clazz;

    public XmlSerializer(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String serialize(T entity) throws IOException {
        return xmlMapper.writeValueAsString(entity);
    }

    @Override
    public T deserialize(String data) throws IOException {
        return xmlMapper.readValue(data, clazz);
    }

    @Override
    public void writeToFile(T entity, File file) throws IOException {
        xmlMapper.writeValue(file, entity);
    }

    @Override
    public T readFromFile(File file) throws IOException {
        return xmlMapper.readValue(file, clazz);
    }

    public void writeListToFile(Iterable<T> entityList, File file) throws IOException {
        xmlMapper.writeValue(file, entityList);
    }

    public List<T> readListFromFile(File file) throws IOException {
        return xmlMapper.readValue(file, new TypeReference<List<T>>() {});
    }
}
