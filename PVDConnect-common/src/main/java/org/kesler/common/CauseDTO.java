package org.kesler.common;


import java.util.Collection;
import java.util.Date;

public class CauseDTO {

    private String causeId;
    private RecordDTO recordDTO;
    private String purposeString;
    private String stateString;
    private String statusMdString;
    private Date stateChangeDate;
    private Date estimateDate;
    private Collection<String> applicators;
    private Collection<String> steps;
    private String curStep;
    private String obj;


    public String getCauseId() {
        return causeId;
    }
    public void setCauseId(String causeId) {
        this.causeId = causeId;
    }

    public RecordDTO getRecordDTO() {
        return recordDTO;
    }
    public void setRecordDTO(RecordDTO recordDTO) {
        this.recordDTO = recordDTO;
    }

    public String getPurposeString() {
        return purposeString;
    }
    public void setPurposeString(String purposeString) {
        this.purposeString = purposeString;
    }

    public String getStateString() {
        return stateString;
    }
    public void setStateString(String stateString) {
        this.stateString = stateString;
    }

    public String getStatusMdString() {
        return statusMdString;
    }
    public void setStatusMdString(String statusMdString) {
        this.statusMdString = statusMdString;
    }

    public Date getStateChangeDate() {
        return stateChangeDate;
    }
    public void setStateChangeDate(Date stateChangeDate) {
        this.stateChangeDate = stateChangeDate;
    }

    public Date getEstimateDate() {
        return estimateDate;
    }
    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    public Collection<String> getApplicators() {
        return applicators;
    }
    public void setApplicators(Collection<String> applicators) {
        this.applicators = applicators;
    }

    public Collection<String> getSteps() {
        return steps;
    }
    public void setSteps(Collection<String> steps) {
        this.steps = steps;
    }

    public String getCurStep() {
        return curStep;
    }
    public void setCurStep(String curStep) {
        this.curStep = curStep;
    }

    public String getObj() {
        return obj;
    }
    public void setObj(String obj) {
        this.obj = obj;
    }

}
