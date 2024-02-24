package com.example.campusconnect;

public class Document {
    private int documentId;
    private String title;
    private String content;

    public Document(int documentId, String title, String content) {
        this.documentId = documentId;
        this.title = title;
        this.content = content;
    }
}
