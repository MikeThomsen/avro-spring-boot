package com.example.demo.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.MessageRecord;
import org.apache.avro.specific.SpecificData;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import javax.xml.validation.Schema;

@Configuration
public class JsonConfig extends MappingJackson2HttpMessageConverter {

    public JsonConfig(ObjectMapper objectMapper) {
        super(objectMapper);

        objectMapper.addMixIn(MessageRecord.class, MixIn.class);
    }

    abstract class MixIn {
        @JsonIgnore
        abstract Schema getSchema(); // we don't need it!
        @JsonIgnore
        abstract SpecificData getSpecificData();
    }
}