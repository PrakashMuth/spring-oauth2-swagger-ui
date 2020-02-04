/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.swagger.ui.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Role implements Serializable {

    private static final long serialVersionUID = 1943459691;

    private Integer id;
    private String  name;

    public Role() {}

    public Role(Role value) {
        this.id = value.id;
        this.name = value.name;
    }

    public Role(
        Integer id,
        String  name
    ) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Role (");

        sb.append(id);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
