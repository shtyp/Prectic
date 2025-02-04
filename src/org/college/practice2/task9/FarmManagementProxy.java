package org.college.practice2.task9;

import java.util.List;

interface FarmManagementProxy {
    List<Object> executeQuery(String query);
    boolean executeUpdate(String query);
    boolean checkSystemStatus();
    void connect();
    void disconnect();
}
