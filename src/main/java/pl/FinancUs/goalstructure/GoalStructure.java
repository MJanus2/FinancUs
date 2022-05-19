package pl.FinancUs.goalstructure;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "Goal")
public class GoalStructure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int goalID;
    private String goalTitle;
    private LocalDateTime dueDate;
    private String goalNotes;
    private List<StepStructure> stepStructureList;


    private GoalStructure(final int goalID, final String goalTitle, final LocalDateTime dueDate, final String goalNotes, final List<StepStructure> stepStructureList) {
        this.goalID = goalID;
        this.goalTitle = goalTitle;
        this.dueDate = dueDate;
        this.goalNotes = goalNotes;
        this.stepStructureList = stepStructureList;
    }

    public int getGoalID() {
        return goalID;
    }

    public void setGoalID(final int goalID) {
        this.goalID = goalID;
    }

    public String getGoalTitle() {
        return goalTitle;
    }

    public void setGoalTitle(final String goalTitle) {
        this.goalTitle = goalTitle;
    }

    public LocalDateTime getDueDate() { return dueDate;}

    public void setDueDate(final LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getGoalNotes() {
        return goalNotes;
    }

    public void setGoalNotes(final String goalNotes) {
        this.goalNotes = goalNotes;
    }

    public List<StepStructure> getStepStructureList() {
        return stepStructureList;
    }

    public void setStepStructureList(final List<StepStructure> stepStructureList) {
        this.stepStructureList = stepStructureList;
    }

    @Override
    public String toString() {
        return "Goal " + goalID + ": " +
                "Title: " + goalTitle + '\'' +
                "Deadline: " + dueDate + '\'' +
                "Notes: " + goalNotes + '\'' +
                "Steps" + stepStructureList + '\''
                ;
    }

    public static class Builder {
        private int goalID;
        private String goalTitle;
        private LocalDateTime dueDate;
        private String goalNotes;
        private List<StepStructure> stepStructureList = new ArrayList<>();


        //builder methods


        public Builder withGoalID(final int goalID) {
            this.goalID = goalID;
            return this;
        }

        public Builder withGoalTitle(final String goalTitle) {
            this.goalTitle = goalTitle;
            return this;

        }

        public Builder withDueDate(final LocalDateTime dueDate) {
            this.dueDate = dueDate;
            return this;

        }

        public Builder withGoalNotes(final String goalNotes) {
            this.goalNotes = goalNotes;
            return this;

        }

        public Builder withStepStructureList(final List<StepStructure> stepStructureList) {
            this.stepStructureList = stepStructureList;
            return this;
        }

        //builder of object GoalStructure

        public GoalStructure build() {
            return new GoalStructure(goalID, goalTitle, dueDate, goalNotes, stepStructureList);
        }
    }
}
