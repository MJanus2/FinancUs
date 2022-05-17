package pl.FinancUs.goalstructure;

import java.time.LocalDateTime;

public class GoalStructure {
    private int GoalID;
    private String goalTitle;
    private LocalDateTime dueDate;
    private String goalNotes;


    public GoalStructure(int goalID, String goalTitle, LocalDateTime dueDate, String goalNotes) {
        GoalID = goalID;
        this.goalTitle = goalTitle;
        this.dueDate = dueDate;
        this.goalNotes = goalNotes;
    }

    public GoalStructure(int goalID, String goalTitle, LocalDateTime dueDate) {
        GoalID = goalID;
        this.goalTitle = goalTitle;
        this.dueDate = dueDate;
    }

    public GoalStructure(int goalID, String goalTitle, String goalNotes) {
        GoalID = goalID;
        this.goalTitle = goalTitle;
        this.goalNotes = goalNotes;
    }

    public int getGoalID() {
        return GoalID;
    }

    public void setGoalID(int goalID) {
        GoalID = goalID;
    }

    public String getGoalTitle() {
        return goalTitle;
    }

    public void setGoalTitle(String goalTitle) {
        this.goalTitle = goalTitle;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getGoalNotes() {
        return goalNotes;
    }

    public void setGoalNotes(String goalNotes) {
        this.goalNotes = goalNotes;
    }

    @Override
    public String toString() {
        return "Goal " + GoalID + ": " +
                "Title: " + goalTitle + '\'' +
                "Deadline: " + dueDate + '\'' +
                "Notes: " + goalNotes + '\''
                ;
    }
}
