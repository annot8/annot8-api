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
  default Item create(){
    return create(null, null, null);
  }

  /**
   * Create a new item with the given ID
   *
   * @param id the ID of the item
   * @return non-null
   */
  default Item create(String id){
    return create(null, id, null);
  }

  /**
   * Create a new item with a parent
   *
   * @param parent the parent
   * @return non-null
   */
  default Item create(Item parent){
    return create(parent, null, null);
  }

  /**
   * Create a new item with a parent and the given ID
   *
   * @param parent the parent
   * @param id the ID of the item
   * @return non-null
   */
  Item create(Item parent, String id);

  /**
   * Create a new item and immediately do something with it
   *
   * @param func Actions to be performed on item
   * @return The created item
   */
  default Item create(Consumer<Item> func){
    return create(null, null, func);
  }

  /**
   * Create a new item with the given ID, and immediately do something with it
   *
   * @param func Actions to be performed on item
   * @param id the ID of the item
   * @return The created item
   */
  default Item create(String id, Consumer<Item> func){
    return create(null, id, func);
  }

  /**
   * Create a new item with a parent and immediately do something with it
   *
   * @param parent Parent item
   * @param func Actions to be performed on item
   * @return The created item
   */
  default Item create(Item parent, Consumer<Item> func){
    return create(parent, null, func);
  }

  /**
   * Create a new item with a parent and the given ID, and immediately do something with it
   *
   * @param parent Parent item (null if Item has no parent)
   * @param func Actions to be performed on item (null if no action is to be performed)
   * @param id the ID of the item (null to use default ID)
   * @return The created item
   */
  default Item create(Item parent, String id, Consumer<Item> func){
    Item item = create(parent, id);

    if(func != null)
      func.accept(item);

    return item;
  }
}
