package com.example.mapstruct.Model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private int id;
    private String name;
    private String lastName;
    private int age;

    private List<Note> notes = new ArrayList<>();

}
