/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.pipelines;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Tracks the status of items as they pass through the pipeline, including retaining a record of
 * their final state once they have been processed.
 */
public interface PipelineItemState {

  /**
   * Update the status of an item
   *
   * @param itemId the id of the item
   * @param status the status to set to
   */
  void setItemStatus(String itemId, ItemStatus status);

  /** @return all items recorded in this history */
  Map<String, ItemStatus> getAll();

  /**
   * Get the status for the given item
   *
   * @param itemId the id of the item
   * @return the status of a specific item
   */
  default Optional<ItemStatus> getItemStatus(String itemId) {
    return Optional.ofNullable(getAll().get(itemId));
  }

  /** @return Return a set of all IDs currently recorded in this history */
  default Set<String> getIds() {
    return getAll().keySet();
  }
}
