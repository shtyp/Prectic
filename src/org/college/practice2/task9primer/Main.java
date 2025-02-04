package org.college.practice2.task9primer;

public class Main {
    public static void main(String[] args) {
        DBAccess realDB = new DBAccess();
        DatabaseAccessProxy proxy = new DBAccessProxy(realDB);
        DatabaseController controller = new DatabaseController(proxy);

        proxy.connect();
        controller.fetchData();
        controller.insertData();
        controller.checkStatus();
        proxy.disconnect();
    }
}
