package com.flymatcher.error.builders;

import static com.flymatcher.error.builders.FlymatcherProviderErrorBuilder.aFlymatcherProviderError;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.flymatcher.error.ErrorType;
import com.flymatcher.error.FlymatcherError;
import com.flymatcher.error.FlymatcherProviderError;

public class FlymatcherErrorBuilder {

  private String errorDescription;
  private ErrorType errorType;
  private List<FlymatcherProviderError> providerErrors;

  private FlymatcherErrorBuilder() {}

  public static FlymatcherErrorBuilder aFlymatcherError() {
    return new FlymatcherErrorBuilder();
  }

  public FlymatcherError build() {
    final FlymatcherError flymatcherError = new FlymatcherError();

    flymatcherError.setErrorDescription(errorDescription);
    flymatcherError.setErrorType(errorType);
    flymatcherError.setProviderErrors(providerErrors);

    return flymatcherError;
  }


  public FlymatcherErrorBuilder withErrorDescription(final String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  public FlymatcherErrorBuilder withErrorType(final ErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

  public FlymatcherErrorBuilder withFlymatcherProviderErrors(
      final FlymatcherProviderErrorBuilder... builders) {
    return withFlymatcherProviderErrors(Arrays.asList(builders));

  }

  public FlymatcherErrorBuilder withFlymatcherProviderErrors(
      final List<FlymatcherProviderErrorBuilder> builders) {
    if (null == this.providerErrors) {
      this.providerErrors = new ArrayList<FlymatcherProviderError>();
    }

    for (final FlymatcherProviderErrorBuilder builder : builders) {
      this.providerErrors.add(builder.build());
    }

    return this;
  }

  public FlymatcherErrorBuilder withNoFlymatcherProviderErrors() {
    this.providerErrors = null;
    return this;

  }


  public FlymatcherErrorBuilder withDefaultValues() {
    this.providerErrors = asList(aFlymatcherProviderError().withDefaultValues().build());
    this.errorType = ErrorType.BAD_REQUEST;
    this.errorDescription = "Validation Error";

    return this;
  }
}


