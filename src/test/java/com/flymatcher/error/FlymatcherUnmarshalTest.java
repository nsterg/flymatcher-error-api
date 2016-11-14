package com.flymatcher.error;

import static com.flymatcher.error.builders.FlymatcherErrorBuilder.aFlymatcherError;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FlymatcherUnmarshalTest {

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
  }

  @Test
  public void shouldUnmarshalFlymatcherWithProviderError()
      throws JsonParseException, JsonMappingException, IOException {
    final FlymatcherError expectedDto = aFlymatcherError().withDefaultValues().build();

    final String json =
        readFileToString(new File("src/test/resources/junit/flymatcher-provider-error.json"));

    final FlymatcherError actualDto = mapper.readValue(json, FlymatcherError.class);

    assertEquals("Dto did not match expected input", expectedDto, actualDto);

  }

  @Test
  public void shouldUnmarshalFlymatcherNoProviderError()
      throws JsonParseException, JsonMappingException, IOException {
    final FlymatcherError expectedDto =
        aFlymatcherError().withErrorDescription("Something went wrong")
            .withErrorType(ErrorType.INTERNAL_SERVER_ERROR).build();

    final String json =
        readFileToString(new File("src/test/resources/junit/flymatcher-error.json"));

    final FlymatcherError actualDto = mapper.readValue(json, FlymatcherError.class);

    assertEquals("Dto did not match expected input", expectedDto, actualDto);

  }

}

