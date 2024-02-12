package com.prodonik.posting.models;

import lombok.Data;

@Data
public class Comment {
    private Post post;
    private User owner;
    private String content;
}
