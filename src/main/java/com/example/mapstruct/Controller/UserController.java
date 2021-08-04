package com.example.mapstruct.Controller;

import com.example.mapstruct.Dto.UserDto;
import com.example.mapstruct.Mapper.UserMapper;
import com.example.mapstruct.Model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserMapper userMapper;

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody UserDto userDto){

        // service code

        return userMapper.dtoToModel(userDto);
    }

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getUserDtoList(){

        // service code

        User user1 = User.builder().id(1).age(23).name("Mert").lastName("Çakmak")
                .build();

        User user2 = User.builder().id(1).age(23).name("Mert").lastName("Çakmak")
                .build();

        List<User> users = Arrays.asList(user1,user2);
        return userMapper.modelsToDtos(users);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUser(@PathVariable int id){

        // service code

        User user = User.builder().id(1).age(23).name("Mert").lastName("Çakmak")
                .build();

        return userMapper.modelToDto(user);
    }
}
