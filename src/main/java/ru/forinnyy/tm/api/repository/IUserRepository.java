package ru.forinnyy.tm.api.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.forinnyy.tm.enumerated.Role;
import ru.forinnyy.tm.exception.field.LoginEmptyException;
import ru.forinnyy.tm.exception.user.ExistsEmailException;
import ru.forinnyy.tm.model.User;

public interface IUserRepository extends IRepository<User> {

    @Nullable
    User findByLogin(@NotNull String login) throws LoginEmptyException;

    @Nullable
    User findByEmail(@NotNull String email) throws ExistsEmailException;

    @NotNull
    Boolean isLoginExist(@NotNull String login);

    @NotNull
    Boolean isEmailExist(@NotNull String email);

}
