package org.college.practice2.task10;

public class Main {
    public static void main(String[] args) {
        IFarmDataDriverAdapter adapter = new LocalFarmDataAdapter();
        FarmDataAccess farmDataAccess = new FarmDataAccess(adapter);
        IFarmDataAccessProxy farmProxy = new FarmDataAccessProxy(farmDataAccess);
        FarmController controller = new FarmController(farmProxy);

        farmProxy.connect("Farm_123");
        String[] cropData = farmProxy.getCropData(new int[]{101, 102});
        for (String data : cropData) {
            System.out.println(data);
        }
        farmProxy.disconnect();
    }
}