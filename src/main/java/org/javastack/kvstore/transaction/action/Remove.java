package org.javastack.kvstore.transaction.action;

import org.javastack.kvstore.holders.DataHolder;
import org.javastack.kvstore.structures.btree.Node;

/**
 * @author: allenduke
 * @mail: allenduke@didiglobal.com
 * @date 2023/6/16
 * description:
 */
public class Remove<K extends DataHolder<K>, V extends DataHolder<V>>  extends Action<K, V> {

    @Override
    public void doAction() {

    }
}
