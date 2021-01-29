package com.jnxaread.entity;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 全局单例实体类
 * 用来存放所有访问IP的访问时间
 * 如果有需要也可以用来存放访问ip的访问次数
 *
 * @author 未央
 * @create 2019-12-03 10:42
 */
public class AccessIPContainer {

    private static final AccessIPContainer ACCESS_IP_CONTAINER = new AccessIPContainer();

    /**
     * 恶意IP容器
     */
    private final ArrayList<String> viciousIPList;

    /**
     * 受限IP容器
     * 键：受限制IP
     * 值：限制到期时间
     */
    private final ConcurrentHashMap<String, Long> limitedIPMap;

    /**
     * 访问IP容器
     * 键：访问IP
     * 值：访问信息【index-0：访问次数；index-1：初次访问时间】
     */
    private final ConcurrentHashMap<String, long[]> accessIPMap;

    private AccessIPContainer() {
        viciousIPList = new ArrayList<>();
        limitedIPMap = new ConcurrentHashMap<>();
        accessIPMap = new ConcurrentHashMap<>();
    }

    public static AccessIPContainer getAccessIpContainer() {
        return ACCESS_IP_CONTAINER;
    }

    public ArrayList<String> getViciousIPList() {
        return viciousIPList;
    }

    public ConcurrentHashMap<String, Long> getLimitedIPMap() {
        return limitedIPMap;
    }

    public ConcurrentHashMap<String, long[]> getAccessIPMap() {
        return accessIPMap;
    }
}
