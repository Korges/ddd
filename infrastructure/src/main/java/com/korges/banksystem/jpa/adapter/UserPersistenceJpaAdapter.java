package com.korges.banksystem.jpa.adapter;

import com.korges.banksystem.jpa.entity.UserEntity;
import com.korges.banksystem.jpa.repository.UserRepository;
import com.korges.banksystem.user.model.User;
import com.korges.banksystem.user.port.outgoing.UserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPersistenceJpaAdapter implements UserPersistencePort {

    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        UserEntity entity = new UserEntity();
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());

        entity = userRepository.save(entity);

        return mapUserEntityToUser(entity);
    }

    @Override
    public User update(long id, User user) {
        return null;
    }

    @Override
    public User read(long id) {
        return userRepository.findById(id)
                .map(this::mapUserEntityToUser)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public User delete(long id) {
        return null;
    }

    @Override
    public List<User> getListOfSuspendedAccounts() {
        return null;
    }

    @Override
    public User suspendAccount(long id) {
        return null;
    }

    @Override
    public User activateAccount(long id) {
        return null;
    }

    private User mapUserEntityToUser(UserEntity entity) {
        User response = new User();
        response.setId(entity.getId());
        response.setFirstName(entity.getFirstName());
        response.setLastName(entity.getLastName());

        return response;
    }
}
