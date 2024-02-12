package com.prodonik.posting.models;

import com.prodonik.posting.LinkedList.LinkedList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private User owner;
    private String description;
    private String pathToPicture;
    private LinkedList comments;

}
