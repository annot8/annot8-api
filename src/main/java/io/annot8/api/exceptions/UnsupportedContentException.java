/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.exceptions;

/** Exception indicating that the content type is not supported */
public class UnsupportedContentException extends Annot8RuntimeException {

  private static final long serialVersionUID = 1L;

  /**
   * Create an exception with the given message
   *
   * @param message the message for information
   */
  public UnsupportedContentException(final String message) {
    super(message);
  }

  /**
   * Create an exception with the given message and a root cause
   *
   * @param message the message for information
   * @param t original throwable
   */
  public UnsupportedContentException(final String message, final Throwable t) {
    super(message, t);
  }
}
