package com.flymatcher.error.builders;

import com.flymatcher.error.FlymatcherProviderError;

public class FlymatcherProviderErrorBuilder {


  private String parameterName;
  private String parameterValue;
  private String message;

  private FlymatcherProviderErrorBuilder() {}

  public static FlymatcherProviderErrorBuilder aFlymatcherProviderError() {
    return new FlymatcherProviderErrorBuilder();
  }

  public FlymatcherProviderError build() {
    final FlymatcherProviderError flymatcherProviderError = new FlymatcherProviderError();

    flymatcherProviderError.setMessage(message);
    flymatcherProviderError.setParameterName(parameterName);
    flymatcherProviderError.setParameterValue(parameterValue);

    return flymatcherProviderError;
  }

  public FlymatcherProviderErrorBuilder withParameterName(final String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  public FlymatcherProviderErrorBuilder withParameterValue(final String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

  public FlymatcherProviderErrorBuilder withMessage(final String message) {
    this.message = message;
    return this;
  }

  public FlymatcherProviderErrorBuilder withDefaultValues() {
    this.parameterName = "OriginPlace";
    this.parameterValue = "Some dodgy value";
    this.message = "Incorrect value";

    return this;
  }

}
