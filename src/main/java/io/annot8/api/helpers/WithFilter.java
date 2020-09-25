/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.helpers;

import io.annot8.api.filters.Filter;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * General interface for filtering elements to find matches.
 *
 * @param <T> element type to find
 */
public interface WithFilter<T> {

  /**
   * Filter to many matching elements
   *
   * @param filter the test to filter with
   * @return stream of matching annotations
   */
  Stream<T> filter(Filter<T> filter);

  /**
   * Find a single matching element
   *
   * @param filter the test to filter with
   * @return single of matching annotation (or empty)
   */
  default Optional<T> find(Filter<T> filter) {
    return filter(filter).findAny();
  }
}
