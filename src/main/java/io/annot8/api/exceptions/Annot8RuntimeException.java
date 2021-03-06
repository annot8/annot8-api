/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.exceptions;

/** Base class for all Annot8 runtime exceptions */
public class Annot8RuntimeException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  /**
   * Create an exception with the given message
   *
   * @param message the message for info
   */
  public Annot8RuntimeException(final String message) {
    super(message);
  }

  /**
   * Create an exception with the given message and a root cause
   *
   * @param message the message for info
   * @param t original exception
   */
  public Annot8RuntimeException(final String message, final Throwable t) {
    super(message, t);
  }
}
