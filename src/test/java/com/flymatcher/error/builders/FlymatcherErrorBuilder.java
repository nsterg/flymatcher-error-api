package com.flymatcher.error.builders;

import static com.flymatcher.error.builders.FlymatcherProviderErrorBuilder.aFlymatcherProviderError;

import com.flymatcher.error.ErrorType;
import com.flymatcher.error.FlymatcherError;
import com.flymatcher.error.FlymatcherProviderError;

public class FlymatcherErrorBuilder {

  private String errorDescription;
  private ErrorType errorType;
  private FlymatcherProviderError providerError;

  private FlymatcherErrorBuilder() {}

  public static FlymatcherErrorBuilder aFlymatcherError() {
    return new FlymatcherErrorBuilder();
  }

  public FlymatcherError build() {
    final FlymatcherError flymatcherError = new FlymatcherError();

    flymatcherError.setErrorDescription(errorDescription);
    flymatcherError.setErrorType(errorType);
    flymatcherError.setProviderError(providerError);

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

  public FlymatcherErrorBuilder withFlymatcherProviderError(
      final FlymatcherProviderError providerError) {
    this.providerError = providerError;
    return this;
  }

  public FlymatcherErrorBuilder withDefaultValues() {
    this.providerError = aFlymatcherProviderError().withDefaultValues().build();
    this.errorType = ErrorType.INTERNAL_SERVER_ERROR;
    this.errorDescription = "Something went wrong";

    return this;
  }
}


