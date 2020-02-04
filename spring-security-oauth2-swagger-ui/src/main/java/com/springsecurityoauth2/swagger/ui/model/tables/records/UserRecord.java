/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.swagger.ui.model.tables.records;


import com.springsecurityoauth2.swagger.ui.model.tables.User;

import java.sql.Time;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record7<Integer, String, String, String, String, String, Time> {

    private static final long serialVersionUID = -1314965564;

    /**
     * Setter for <code>public.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.user.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user.user_name</code>.
     */
    public void setUserName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user.user_name</code>.
     */
    public String getUserName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.user.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.user.password</code>.
     */
    public void setPassword(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.user.password</code>.
     */
    public String getPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.user.created_at</code>.
     */
    public void setCreatedAt(Time value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.user.created_at</code>.
     */
    public Time getCreatedAt() {
        return (Time) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, String, String, Time> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, String, String, String, String, Time> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return User.USER.LAST_NAME;
    }

    @Override
    public Field<String> field4() {
        return User.USER.USER_NAME;
    }

    @Override
    public Field<String> field5() {
        return User.USER.EMAIL;
    }

    @Override
    public Field<String> field6() {
        return User.USER.PASSWORD;
    }

    @Override
    public Field<Time> field7() {
        return User.USER.CREATED_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public String component4() {
        return getUserName();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public String component6() {
        return getPassword();
    }

    @Override
    public Time component7() {
        return getCreatedAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public String value4() {
        return getUserName();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public String value6() {
        return getPassword();
    }

    @Override
    public Time value7() {
        return getCreatedAt();
    }

    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public UserRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserRecord value6(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserRecord value7(Time value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Time value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String firstName, String lastName, String userName, String email, String password, Time createdAt) {
        super(User.USER);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, userName);
        set(4, email);
        set(5, password);
        set(6, createdAt);
    }
}
