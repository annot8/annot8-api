/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.pipelines;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Provides a NoOp implementation of {@link PipelineItemState}, which always returns empty objects
 */
public final class NoOpItemState implements PipelineItemState {
  private static final NoOpItemState INSTANCE = new NoOpItemState();

  private NoOpItemState() {
    // Private constructor for singleton
  }

  public static NoOpItemState getInstance() {
    return INSTANCE;
  }

  @Override
  public void setItemStatus(String itemId, ItemStatus status) {
    // Do nothing
  }

  @Override
  public Map<String, ItemStatus> getAll() {
    return Collections.emptyMap();
  }

  @Override
  public Set<String> getIds() {
    return Collections.emptySet();
  }

  @Override
  public Optional<ItemStatus> getItemStatus(String itemId) {
    return Optional.empty();
  }
}
