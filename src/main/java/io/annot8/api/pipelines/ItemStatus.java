/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.pipelines;

/** Possible statuses when tracking item state in a pipeline */
public enum ItemStatus {
  /** Item is being processed */
  PROCESSING,

  /** Item has been processed, and returned OK */
  PROCESSED_OK,

  /** Item has been processed, and returned ITEM_ERROR */
  PROCESSED_ITEM_ERROR,

  /** Item has been processed, and returned PROCESSOR_ERROR */
  PROCESSED_PROCESSOR_ERROR
}
