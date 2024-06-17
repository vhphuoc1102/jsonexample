package com.phuocvh.jsonexample.entities;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class CustomSerializer extends JsonSerializer<Object> {
  @Override
  public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException, JsonProcessingException {
//    if(value)
    gen.writeStartObject();


    gen.writeEndObject();
  }
}
