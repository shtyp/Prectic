package org.college.practice2.task6;

class LivestockReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(FarmRecord record) {
        System.out.println("Generating livestock report: " + record.getRecordName());
    }

    @Override
    public void sendReportViaEmail(FarmRecord record) {
        System.out.println("Sending livestock report via email: " + record.getRecordName());
    }

    @Override
    public void sendReportViaSMS(FarmRecord record) {
        System.out.println("Sending livestock report via SMS: " + record.getRecordName());
    }
}
