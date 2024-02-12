package com.prodonik.posting.LinkedList;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class LinkedList {
    Object value;
    Object next;

    public LinkedList (Object value) {
        this.value = value;
    }
}
