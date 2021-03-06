package com.tngtech.jgiven.report.html;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.report.model.ReportModel;

public class WhenReportModelHtmlWriter extends Stage<WhenReportModelHtmlWriter> {

    @ExpectedScenarioState
    protected ReportModel reportModel;

    @ProvidedScenarioState
    protected String html;

    public void the_HTML_report_is_generated() {
        html = ReportModelHtmlWriter.toString( reportModel );
    }

}
