package com.korges.banksystem.jpa.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.korges.banksystem.user.model.User;
import com.korges.banksystem.user.port.incoming.UserSuspension;
import com.korges.banksystem.user.port.outgoing.UserPersistencePort;

@Service
@RequiredArgsConstructor
class UserSuspensionAdapter implements UserSuspension {

    private final UserPersistencePort userPersistencePort;

    @Override
    public User suspendAccount(final User user) {
        if (user.isSuspended()) {
            throw new RuntimeException("Account is already suspended");
        }

        return userPersistencePort.suspendAccount(user.id());
    }

    @Override
    public User activateAccount(final User user) {
        if (!user.isSuspended()) {
            throw new RuntimeException("Account is active");
        }

        return userPersistencePort.activateAccount(user.id());
    }
}
