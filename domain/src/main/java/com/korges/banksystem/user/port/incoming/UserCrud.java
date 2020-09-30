package com.korges.banksystem.user.port.incoming;

import com.korges.banksystem.user.model.User;

import java.util.Optional;

public interface UserCrud {
    User create(User user);
    Optional<User> read(long id);
    User update(long id, User user);
    User delete(long id);
}
