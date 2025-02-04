package org.college.practice2.task10primer;

public class Main {
    public static void main(String[] args) {
        IDatabaseDriverAdapter adapter = new MsSQLDatabaseAdapter();
        DBAccess dbAccess = new DBAccess(adapter);
        IDatabaseAccessProxy dbProxy = new DBAccessProxy(dbAccess);
        DatabaseController controller = new DatabaseController(dbProxy);

        dbProxy.open("jdbc:sqlserver://localhost;databaseName=TestDB");
        String[] results = dbProxy.executeQuery(new int[]{1, 2, 3});
        for (String result : results) {
            System.out.println(result);
        }
        dbProxy.close();
    }
}
