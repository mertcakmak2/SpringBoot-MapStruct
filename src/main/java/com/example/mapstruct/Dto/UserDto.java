package com.example.mapstruct.Dto;

import com.example.mapstruct.Model.Note;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto {

    private String name;
    private String userLastName;
    private int userAge;
    private List<Note> noteList = new ArrayList<>();
}
