package com.example.gleb.timetable;

/**
 * Created by Gleb on 17.10.2015.
 */
public class Lesson {
    private int idLesson;
    private String nameLesson;
    private String auditory;
    private String nameTeacher;
    private int idPhotoTeacher;

    public Lesson(int idLesson, String nameLesson, String auditory, String nameTeacher, int idPhotoTeacher) {
        this.idLesson = idLesson;
        this.nameLesson = nameLesson;
        this.auditory = auditory;
        this.nameTeacher = nameTeacher;
        this.idPhotoTeacher = idPhotoTeacher;
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }

    public String getAuditory() {
        return auditory;
    }

    public void setAuditory(String auditory) {
        this.auditory = auditory;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public int getIdPhotoTeacher() {
        return idPhotoTeacher;
    }

    public void setIdPhotoTeacher(int idPhotoTeacher) {
        this.idPhotoTeacher = idPhotoTeacher;
    }
}
