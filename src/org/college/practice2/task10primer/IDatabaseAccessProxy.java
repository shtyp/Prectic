package org.college.practice2.task10primer;

public interface IDatabaseAccessProxy {
    String[] executeQuery(int[] lineNumbers);
    void executeQueryNoResult(int[] lineNumbers);
    boolean checkDatabaseStatus();
    void open(String url);
    void close();
    void commit();
    void rollback();
}
