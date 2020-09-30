package com.korges.banksystem.jpa.adapter;

import com.korges.banksystem.user.UserInputDto;
import com.korges.banksystem.user.UserOutputDto;
import com.korges.banksystem.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import com.korges.banksystem.user.model.User;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserCrudAdapter userCrudAdapter;
    private final UserSuspensionAdapter userSuspensionAdapter;
    private final UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public UserOutputDto createNewUser(UserInputDto userInputDto) {
        User user = userCrudAdapter.create(
                mapper.userInputDtoToUser(userInputDto));

        return mapper.userToUserOutputDto(user);
    }

    public UserOutputDto findUserById(long id) {
        return userCrudAdapter.read(id)
                .map(mapper::userToUserOutputDto)
                .orElseThrow(RuntimeException::new);
    }

    public UserOutputDto updateUser(long id, User user) {
        return userCrudAdapter.read(id)
                .map(x -> userCrudAdapter.update(id, user))
                .map(mapper::userToUserOutputDto)
                .orElseThrow();
    }

    public User deleteUserById(long id) {
        return userCrudAdapter.read(id)
                .orElseThrow(RuntimeException::new);
    }

    public User suspendAccount(long id) {
        return userCrudAdapter.read(id)
                .map(userSuspensionAdapter::suspendAccount)
                .orElseThrow(RuntimeException::new);
    }

    public User activateAccount(long id) {
        return userCrudAdapter.read(id)
                .map(userSuspensionAdapter::activateAccount)
                .orElseThrow(RuntimeException::new);
    }
}
