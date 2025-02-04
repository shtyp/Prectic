package org.college.practice2.task10primer;

public class DBAccess {
    private String url;
    private boolean isOpen;
    private IDatabaseDriverAdapter impl;

    public DBAccess(IDatabaseDriverAdapter impl) {
        this.impl = impl;
    }

    public void setDriverAdapter(IDatabaseDriverAdapter impl) {
        this.impl = impl;
    }

    public String[] executeQuery(int[] lineNumbers) {
        return impl.executeQuery(lineNumbers);
    }

    public void executeQueryNoResult(int[] lineNumbers) {
        impl.executeQueryNoResult(lineNumbers);
    }

    public boolean checkDatabaseStatus() {
        return impl.checkDatabaseStatus();
    }

    public void open(String url) {
        this.url = url;
        impl.open(url);
        this.isOpen = true;
    }

    public void close() {
        impl.close();
        this.isOpen = false;
    }

    public void commit() {
        impl.commit();
    }

    public void rollback() {
        impl.rollback();
    }
}

