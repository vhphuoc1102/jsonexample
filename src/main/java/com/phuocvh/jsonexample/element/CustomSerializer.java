package com.phuocvh.jsonexample.element;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomSerializer<T> extends StdSerializer<T> {

  protected CustomSerializer(Class<T> t) {
    super(t);
  }
  public CustomSerializer(){
    this(null);
  }

  @Override
  public void serialize(T person, JsonGenerator gen, SerializerProvider provider) throws IOException {
  }
}
