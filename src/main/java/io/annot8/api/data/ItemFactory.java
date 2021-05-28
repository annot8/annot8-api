/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.api.data;

import java.util.function.Consumer;

/**
 * Factory to createContent new items.
 *
 * <p>The implementation must always be able to createContent a new item, but it doesn't need to
 * processor linking with child items. In which case createContent(Item parent) should call
 * createContent().
 */
public interface ItemFactory {

  /**
   * Create a new item
   *
   * @return non-null
   */
  Item create();

  /**
   * Create a new item with a parent
   *
   * @param parent the parent
   * @return non-null
   */
  Item create(Item parent);

  /**
   * Create a new item and immediately do something with it
   *
   * @param func Actions to be performed on item
   * @return The created item
   */
  Item create(Consumer<Item> func);

  /**
   * Create a new item with a parent and immediately do something with it
   *
   * @param parent Parent item
   * @param func Actions to be performed on item
   * @return The created item
   */
  Item create(Item parent, Consumer<Item> func);
}
