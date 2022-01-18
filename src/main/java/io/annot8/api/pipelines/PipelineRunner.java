/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.pipelines;

public interface PipelineRunner extends Runnable {

  /**
   * Signal to stop the pipeline.
   *
   * <p>Note, implementations may choose to stop imediately or contine processing the current items
   * to completion.
   */
  void stop();

  /**
   * Check if the pipeline is currently running
   *
   * @return true if running (or unable to tell)
   */
  default boolean isRunning() {
    return true;
  }
}
