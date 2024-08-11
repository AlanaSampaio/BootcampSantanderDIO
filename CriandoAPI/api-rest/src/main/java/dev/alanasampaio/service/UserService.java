package dev.alanasampaio;

import dev.alanasampaio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}