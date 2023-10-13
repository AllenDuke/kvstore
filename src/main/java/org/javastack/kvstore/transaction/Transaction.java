package org.javastack.kvstore.transaction;

import org.javastack.kvstore.holders.DataHolder;
import org.javastack.kvstore.structures.btree.BplusTree;
import org.javastack.kvstore.transaction.action.Action;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: allenduke
 * @mail: allenduke@didiglobal.com
 * @date 2023/6/16
 * description:
 */
public class Transaction<K extends DataHolder<K>, V extends DataHolder<V>> {

    /**
     * 事务id
     */
    private long id;

    /**
     * 事务的动作集合
     */
    private Map<K, Action<K, V>> actionMap = new LinkedHashMap<>();

    /**
     * 提交事务。
     *
     * @return
     */
    public boolean commit() {

        return true;
    }

    /**
     * 事务回滚。
     */
    public void rollback() {

    }
}
