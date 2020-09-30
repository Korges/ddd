package com.korges.banksystem.user.port.outgoing;

import com.korges.banksystem.user.model.User;

import java.util.List;
import java.util.Optional;

public interface UserPersistencePort {
    User create(User user);
    User update(long id, User user);
    User read(long id);
    User delete(long id);
    List<User> getListOfSuspendedAccounts();
    User suspendAccount(long id);
    User activateAccount(long id);
}
