package com.flymatcher.error;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

public class FlymatcherError {

  private String errorDescription;

  private FlymatcherProviderError providerError;

  private ErrorType errorType;

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(final String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public FlymatcherProviderError getProviderError() {
    return providerError;
  }

  public void setProviderError(final FlymatcherProviderError providerError) {
    this.providerError = providerError;
  }

  public ErrorType getErrorType() {
    return errorType;
  }

  public void setErrorType(final ErrorType errorType) {
    this.errorType = errorType;
  }


  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }

  @Override
  public boolean equals(final Object obj) {
    return reflectionEquals(this, obj);
  }

  @Override
  public String toString() {
    return reflectionToString(this);
  }

}
