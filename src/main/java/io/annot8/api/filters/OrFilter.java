/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Logical OR of filters
 *
 * @param <T> element type
 */
public class OrFilter<T> implements Filter<T> {

  private final List<Filter<T>> filters;

  @SafeVarargs
  public OrFilter(Filter<T>... filters) {
    this.filters =
        Arrays.stream(filters).filter(Filter.class::isInstance).collect(Collectors.toList());
  }

  @Override
  public boolean test(T t) {
    return filters.stream().anyMatch(f -> f.test(t));
  }

  /**
   * Get all the sub filters of this operation.
   *
   * @return filters
   */
  public Stream<Filter<T>> getFilters() {
    return filters.stream();
  }
}
