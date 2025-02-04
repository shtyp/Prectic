package org.college.practice2.task10primer;

public class DBAccessProxy implements IDatabaseAccessProxy {
    private DBAccess dbHandle;

    public DBAccessProxy(DBAccess dbHandle) {
        this.dbHandle = dbHandle;
    }

    public String[] executeQuery(int[] lineNumbers) {
        long startTime = System.currentTimeMillis();
        String[] result = dbHandle.executeQuery(lineNumbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
        return result;
    }

    public void executeQueryNoResult(int[] lineNumbers) {
        dbHandle.executeQueryNoResult(lineNumbers);
    }

    public boolean checkDatabaseStatus() {
        return dbHandle.checkDatabaseStatus();
    }

    public void open(String url) {
        dbHandle.open(url);
    }

    public void close() {
        dbHandle.close();
    }

    public void commit() {
        dbHandle.commit();
    }

    public void rollback() {
        dbHandle.rollback();
    }
}