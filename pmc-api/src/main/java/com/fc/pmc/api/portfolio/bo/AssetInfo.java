package com.fc.pmc.api.portfolio.bo;

/**
 *
 * @author Andrey Nakin
 */
public class AssetInfo {

    private final Object id;
    private final String name;

    public AssetInfo(Object id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
