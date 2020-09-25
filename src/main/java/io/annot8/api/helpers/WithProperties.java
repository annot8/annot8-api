/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.helpers;

import io.annot8.api.properties.ImmutableProperties;

/** Helper interface to indicate that a class supports ImmutableProperties */
public interface WithProperties {

  /**
   * Get the properties
   *
   * @return the immutable properties associated with this object
   */
  ImmutableProperties getProperties();
}
