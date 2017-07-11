package com.example.android.reportcard;

/**
 * Created by sgomezp on 14/05/2017.
 * ReportCard Class
 * The grades going between 1-10
 */

public class ReportCard {

    // Student's name
    private String mStudentName;

    //Course Year
    private int mCourseYear;

    // Grade's subject

    private int mPhysics;
    private int mBiology;
    private int mCalculus;
    private int mProgramming;

    /**
     * The Constructor. Create a new ReportCard object.
     *
     * @param studentName      Name of the student
     * @param courseYear       Course year
     * @param physicsGrade     Physics grade
     * @param biologyGrade     Biology grade
     * @param calculusGrade    Calculus grade
     * @param programmingGrade Programming grade
     */

    public ReportCard(String studentName, int courseYear, int physicsGrade, int biologyGrade, int calculusGrade, int programmingGrade) {
        mStudentName = studentName;
        mCourseYear = courseYear;
        mPhysics = physicsGrade;
        mBiology = biologyGrade;
        mCalculus = calculusGrade;
        mProgramming = programmingGrade;
    }


    public String getStudentName() {
        // Get the Student's name. @return the current student's name
        return mStudentName;
    }

    public void setStudentName(String studentName) {
        // Set the Student's name
        mStudentName = studentName;
    }

    public int getCourseYear() {
        // Get the Course year. @return the current course year
        return mCourseYear;
    }

    public void setCourseYear(int courseYear) {
        // Set the Course year
        mCourseYear = courseYear;
    }

    public int getPhysicsGrade() {
        // Get the Physics grade. @return the current Physics grade
        return mPhysics;
    }

    public void setPhysicsGrade(int physicsGrade) {
        // Set the Physics grade
        mPhysics = physicsGrade;
    }


    public int getBiologyGrade() {
        // Get the Biology grade. @return the current Biology grade
        return mBiology;
    }

    public void setBiologyGrade(int biologyGrade) {
        // Set the Biology grade
        mBiology = biologyGrade;
    }

    public int getCalculusGrade() {
        // Get the Calculus grade. @return the current Calculus grade
        return mCalculus;
    }

    public void setCalculusGrade(int calculusGrade) {
        // Set the Calculus grade
        mCalculus = calculusGrade;
    }

    public int getProgrammingGrade() {
        // Get the Programming grade. @return the current Programming grade
        return mProgramming;
    }

    public void setProgrammingGrade(int programmingGrade) {
        // Set the Programming grade
        mProgramming = programmingGrade;
    }


    public String toString() {
        //Return a representation of the report card
        return "Student's Name: " + mStudentName + "\n" +
                "Course Year: " + mCourseYear + "\n" +
                "Physics: " + mPhysics + "\n" +
                "Biology: " + mBiology + "\n" +
                "Calculus: " + mCalculus + "\n" +
                "Programming: " + mProgramming;

    }

}
