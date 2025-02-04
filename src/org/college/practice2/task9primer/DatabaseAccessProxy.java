package org.college.practice2.task9primer;

import java.util.List;

interface DatabaseAccessProxy {
    List<Object> executeQuery(String query);
    boolean executeUpdate(String query);
    boolean checkDatabaseStatus();
    void connect();
    void disconnect();
}