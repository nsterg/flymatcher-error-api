package com.flymatcher.error;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

public class FlymatcherProviderError {

  private String parameterName;

  private String parameterValue;

  private String message;

  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(final String parameterName) {
    this.parameterName = parameterName;
  }

  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(final String parameterValue) {
    this.parameterValue = parameterValue;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(final String message) {
    this.message = message;
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
