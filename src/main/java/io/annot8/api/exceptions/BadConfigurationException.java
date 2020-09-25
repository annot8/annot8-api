/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.exceptions;

/**
 * Exception indicating that an unacceptable configuration has been provided to a component, or
 * required configuration information is missing.
 */
public class BadConfigurationException extends Annot8RuntimeException {

  private static final long serialVersionUID = 1L;

  /**
   * Create an exception with the given message
   *
   * @param message the message for info
   */
  public BadConfigurationException(final String message) {
    super(message);
  }

  /**
   * Create an exception with the given message and a root cause
   *
   * @param message the message for info
   * @param t original exception
   */
  public BadConfigurationException(final String message, final Throwable t) {
    super(message, t);
  }
}
