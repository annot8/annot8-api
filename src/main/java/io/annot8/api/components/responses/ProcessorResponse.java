/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.components.responses;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

/**
 * Class to hold the response from a processor.
 *
 * <p>The response consists of a status.
 */
public interface ProcessorResponse {

  /**
   * Create an OK response with no new items
   *
   * @return builder for continuation
   */
  static ProcessorResponseBuilder ok() {
    return new ProcessorResponseBuilder(Status.OK);
  }

  /**
   * Create an ITEM_ERROR response
   *
   * @return builder for continuation
   */
  static ProcessorResponseBuilder itemError() {
    return new ProcessorResponseBuilder(Status.ITEM_ERROR);
  }

  /**
   * Create an ITEM_ERROR response with a collection of exceptions
   *
   * @param exceptions exceptions for information
   * @return builder for continuation
   */
  static ProcessorResponseBuilder itemError(Collection<Exception> exceptions) {
    return new ProcessorResponseBuilder(Status.ITEM_ERROR, exceptions);
  }

  /**
   * Create an ITEM_ERROR response with one or more exception
   *
   * @param exceptions exception for information
   * @return builder for continuation
   */
  static ProcessorResponseBuilder itemError(Exception... exceptions) {
    return new ProcessorResponseBuilder(Status.ITEM_ERROR, Arrays.asList(exceptions));
  }

  /**
   * Create a PROCESSOR_ERROR response
   *
   * @return builder for continuation
   */
  static ProcessorResponseBuilder processingError() {
    return new ProcessorResponseBuilder(Status.PROCESSOR_ERROR);
  }

  /**
   * Create an PROCESSOR_ERROR response with a collection of exceptions
   *
   * @param exceptions exception for information
   * @return builder for continuation
   */
  static ProcessorResponseBuilder processingError(Collection<Exception> exceptions) {
    return new ProcessorResponseBuilder(Status.PROCESSOR_ERROR, exceptions);
  }

  /**
   * Create an PROCESSOR_ERROR response with one or more exception
   *
   * @param exceptions exceptions for information
   * @return builder for continuation
   */
  static ProcessorResponseBuilder processingError(Exception... exceptions) {
    return new ProcessorResponseBuilder(Status.PROCESSOR_ERROR, Arrays.asList(exceptions));
  }

  /**
   * Return the status associated with this response
   *
   * @return status
   */
  Status getStatus();

  /**
   * Return any exceptions associated with this response
   *
   * @return exceptions thrown during processing
   */
  Collection<Exception> getExceptions();

  /**
   * Are exceptions associated with response?
   *
   * @return true is exceptions are part of the response
   */
  default boolean hasExceptions() {
    return !getExceptions().isEmpty();
  }

  /** Response status returned by the processor */
  enum Status {
    /** Indicates that the processor has worked successfully */
    OK,

    /**
     * Indicates that an error happened whilst processing this item, but that it should be possible
     * to process other items.
     */
    ITEM_ERROR,

    /**
     * Indicates that an error happened whilst processing this item, and that it will prevent other
     * items from being processed.
     */
    PROCESSOR_ERROR
  }

  class ProcessorResponseBuilder implements ProcessorResponse {

    private final Status status;
    private final Collection<Exception> exceptions;

    protected ProcessorResponseBuilder(Status status) {
      this.status = status;
      this.exceptions = Collections.emptyList();
    }

    protected ProcessorResponseBuilder(Status status, Collection<Exception> exceptions) {
      this.status = status;
      this.exceptions = exceptions;
    }

    @Override
    public Status getStatus() {
      return status;
    }

    @Override
    public Collection<Exception> getExceptions() {
      return exceptions;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      ProcessorResponseBuilder that = (ProcessorResponseBuilder) o;
      return status == that.status;
    }

    @Override
    public int hashCode() {
      return Objects.hash(status);
    }

    @Override
    public String toString() {
      return status.toString();
    }
  }
}
