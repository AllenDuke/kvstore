package org.javastack.kvstore.transaction.action;

import org.javastack.kvstore.holders.DataHolder;
import org.javastack.kvstore.structures.btree.LeafNode;
import org.javastack.kvstore.structures.btree.Node;

/**
 * @author: allenduke
 * @mail: allenduke@didiglobal.com
 * @date 2023/6/16
 * description:
 */
public class Get<K extends DataHolder<K>, V extends DataHolder<V>>  extends Action<K, V> {

    private K key;

    @Override
    public void doAction() {

    }

    public DataHolder<V> doGet(){
        doAction();
        LeafNode leafNode = (LeafNode) targetNodeAfterAction;
        return leafNode.values[targetNodeAfterAction.findSlotByKey(key)];
    }
}
