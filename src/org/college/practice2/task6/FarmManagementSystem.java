package org.college.practice2.task6;

class FarmManagementSystem {
    private ReportController reportController;

    public FarmManagementSystem() {
        reportController = new ReportController();
        String farmType = "CROP"; // Example type, could be dynamic
        if (farmType.equals("CROP")) {
            reportController.setReportStrategy(new CropReportStrategy());
        } else {
            reportController.setReportStrategy(new LivestockReportStrategy());
        }
    }

    public void manageFarm() {
        reportController.generateReport();
        reportController.sendReportViaEmail();
    }
}
