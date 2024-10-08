package ru.forinnyy.tm.api.repository;

import lombok.NonNull;
import ru.forinnyy.tm.exception.field.AbstractFieldException;
import ru.forinnyy.tm.model.Task;

import java.util.List;

public interface ITaskRepository extends IUserOwnedRepository<Task> {

    @NonNull
    List<Task> findAllByProjectId(@NonNull String userId, @NonNull String projectId);

    @NonNull
    Task create(@NonNull String userId, @NonNull String name) throws AbstractFieldException;

    @NonNull
    Task create(@NonNull String userId, @NonNull String name, @NonNull String description) throws AbstractFieldException;

}
