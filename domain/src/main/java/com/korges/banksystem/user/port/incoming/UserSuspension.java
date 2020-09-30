package com.korges.banksystem.user.port.incoming;

import com.korges.banksystem.user.model.User;

public interface UserSuspension {
    User suspendAccount(User user);
    User activateAccount(User user);
}
