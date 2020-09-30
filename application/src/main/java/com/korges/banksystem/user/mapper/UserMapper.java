package com.korges.banksystem.user.mapper;

import com.korges.banksystem.user.UserInputDto;
import com.korges.banksystem.user.UserOutputDto;
import com.korges.banksystem.user.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User userInputDtoToUser(UserInputDto userInputDTO);

    UserOutputDto userToUserOutputDto(User user);
}
