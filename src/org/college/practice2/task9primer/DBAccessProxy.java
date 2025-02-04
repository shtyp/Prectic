package org.college.practice2.task9primer;

import java.util.Collections;
import java.util.List;

class DBAccessProxy implements DatabaseAccessProxy {
    private DBAccess dbAccess;

    public DBAccessProxy(DBAccess dbAccess) {
        this.dbAccess = dbAccess;
    }

    public List<Object> executeQuery(String query) {
        long startTime = System.currentTimeMillis();
        List<Object> result = Collections.singletonList(dbAccess.executeQuery(query));
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
        return result;
    }

    public boolean executeUpdate(String query) {
        return dbAccess.executeUpdate(query);
    }

    public boolean checkDatabaseStatus() {
        return dbAccess.checkDatabaseStatus();
    }

    public void connect() {
        dbAccess.connect();
    }

    public void disconnect() {
        dbAccess.disconnect();
    }
}
