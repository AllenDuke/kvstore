package org.javastack.kvstore.transaction.action;

import org.javastack.kvstore.holders.DataHolder;
import org.javastack.kvstore.structures.btree.BplusTree;
import org.javastack.kvstore.structures.btree.Node;

/**
 * @author: allenduke
 * @mail: allenduke@didiglobal.com
 * @date 2023/6/16
 * description:
 */
public abstract class Action<K extends DataHolder<K>, V extends DataHolder<V>> {

    protected long transactionId;

    protected BplusTree<K, V> tree;

    protected Node<K, V> targetNodeBeforeAction;

    protected Node<K, V> targetNodeAfterAction;

    public abstract void doAction();
}
