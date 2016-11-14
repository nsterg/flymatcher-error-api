package com.flymatcher.error;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.util.List;

public class FlymatcherError {

  private String errorDescription;

  private List<FlymatcherProviderError> providerErrors;

  private ErrorType errorType;

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(final String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public List<FlymatcherProviderError> getProviderErrors() {
    return providerErrors;
  }

  public void setProviderErrors(final List<FlymatcherProviderError> providerErrors) {
    this.providerErrors = providerErrors;
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
