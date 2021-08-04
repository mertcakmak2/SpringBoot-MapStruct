package com.example.mapstruct.Mapper;

import com.example.mapstruct.Dto.UserDto;
import com.example.mapstruct.Model.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "user.age", target = "userAge")
    @Mapping(source = "user.lastName", target = "userLastName", defaultValue = "soyad")
    @Mapping(source = "user.notes", target = "noteList")
    UserDto modelToDto(User user);

    List<UserDto> modelsToDtos(List<User> users);


    /*@Mapping(source = "userDto.userAge", target = "age")
    @Mapping(source = "userDto.userLastName", target = "lastName")
    @Mapping(source = "userDto.noteList", target = "notes")*/

    // OR @InheritInverseConfiguration

    @InheritInverseConfiguration
    User dtoToModel(UserDto userDto);

}
