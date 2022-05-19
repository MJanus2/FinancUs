package pl.financus.goalstructure;

import java.time.LocalDateTime;

public class StepStructure {
    private int stepID;
    private String stepTitle;
    private LocalDateTime StepDeadline;
    private String StepNotes;

    public StepStructure(int stepID, String stepTitle, LocalDateTime stepDeadline, String stepNotes) {
        this.stepID = stepID;
        this.stepTitle = stepTitle;
        StepDeadline = stepDeadline;
        StepNotes = stepNotes;
    }

    public StepStructure(int stepID, String stepTitle, LocalDateTime stepDeadline) {
        this.stepID = stepID;
        this.stepTitle = stepTitle;
        StepDeadline = stepDeadline;
    }

    public StepStructure(int stepID, String stepTitle, String stepNotes) {
        this.stepID = stepID;
        this.stepTitle = stepTitle;
        StepNotes = stepNotes;
    }

    public int getStepID() {
        return stepID;
    }

    public void setStepID(int stepID) {
        this.stepID = stepID;
    }

    public String getStepTitle() {
        return stepTitle;
    }

    public void setStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
    }

    public LocalDateTime getStepDeadline() {
        return StepDeadline;
    }

    public void setStepDeadline(LocalDateTime stepDeadline) {
        StepDeadline = stepDeadline;
    }

    public String getStepNotes() {
        return StepNotes;
    }

    public void setStepNotes(String stepNotes) {
        StepNotes = stepNotes;
    }

    @Override
    public String toString() {
        return "Step " + stepID + ": " +
                " Title: " + stepTitle + '\'' +
                " Deadline: " + StepDeadline +
                " NOtes: " + StepNotes + '\''
                ;
    }
}
