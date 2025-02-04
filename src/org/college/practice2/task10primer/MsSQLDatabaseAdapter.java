package org.college.practice2.task10primer;

public class MsSQLDatabaseAdapter implements IDatabaseDriverAdapter {
    private String url;

    public void open(String url) {
        this.url = url;
        System.out.println("Connected to MS SQL Database at " + url);
    }

    public void close() {
        System.out.println("Closed connection to MS SQL Database.");
    }

    public String[] executeQuery(int[] lineNumbers) {
        return new String[]{"MS SQL Query Result"};
    }

    public void executeQueryNoResult(int[] lineNumbers) {
        System.out.println("Executed MS SQL query with no result.");
    }

    public boolean checkDatabaseStatus() {
        return true;
    }

    public void commit() {
        System.out.println("Committed transaction on MS SQL Database.");
    }

    public void rollback() {
        System.out.println("Rolled back transaction on MS SQL Database.");
    }
}

