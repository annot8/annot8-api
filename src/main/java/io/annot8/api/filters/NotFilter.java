/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.filters;

/**
 * Logical NOT of filter
 *
 * @param <T> element type
 */
public class NotFilter<T> implements Filter<T> {

  private final Filter<T> filter;

  public NotFilter(Filter<T> filter) {
    this.filter = filter;
  }

  @Override
  public boolean test(T t) {
    return !filter.test(t);
  }

  /**
   * Get all the sub filter of this operation.
   *
   * @return filter
   */
  public Filter<T> getFilter() {
    return filter;
  }
}
