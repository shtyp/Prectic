package org.college.practice2.task6;

interface ReportStrategy {
    void generateReport(FarmRecord record);
    void sendReportViaEmail(FarmRecord record);
    void sendReportViaSMS(FarmRecord record);
}
