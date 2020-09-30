package com.korges.banksystem.jpa.adapter;

import com.korges.banksystem.user.model.User;
import com.korges.banksystem.user.port.incoming.UserCrud;
import com.korges.banksystem.user.port.outgoing.UserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
class UserCrudAdapter implements UserCrud {

    private final UserPersistencePort userPersistencePort;

    @Override
    public User create(User user) {
        return userPersistencePort.create(user);
    }

    @Override
    public Optional<User> read(long id) {
        return userPersistencePort.read(id);
    }

    @Override
    public User update(long id, User user) {
        return userPersistencePort.update(id, user);
    }

    @Override
    public User delete(long id) {
        return userPersistencePort.delete(id);
    }
}
