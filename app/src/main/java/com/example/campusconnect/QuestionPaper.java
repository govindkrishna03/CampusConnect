package com.example.campusconnect;

public class QuestionPaper {
    private int questionPaperId;
    private String title;
    private String content;

    public QuestionPaper(int questionPaperId, String title, String content) {
        this.questionPaperId = questionPaperId;
        this.title = title;
        this.content = content;
    }
}
