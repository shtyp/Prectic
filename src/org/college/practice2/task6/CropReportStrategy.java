package org.college.practice2.task6;

class CropReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(FarmRecord record) {
        System.out.println("Generating crop report: " + record.getRecordName());
    }

    @Override
    public void sendReportViaEmail(FarmRecord record) {
        System.out.println("Sending crop report via email: " + record.getRecordName());
    }

    @Override
    public void sendReportViaSMS(FarmRecord record) {
        System.out.println("Sending crop report via SMS: " + record.getRecordName());
    }
}
