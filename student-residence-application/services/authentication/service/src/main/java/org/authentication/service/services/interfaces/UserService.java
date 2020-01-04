package org.authentication.service.services.interfaces;

import org.authentication.common.exceptions.InvalidOperationException;
import org.authentication.common.exceptions.ObjectNotFoundException;
import org.authentication.common.exceptions.ValidationException;
import org.authentication.dataaccess.data.models.User;
import org.authentication.service.models.RegisterUser;

public interface UserService {

    User getUserByAccessToken(String accessToken) throws ValidationException, InvalidOperationException, ObjectNotFoundException;

    User getUser(String userId) throws ValidationException, InvalidOperationException, ObjectNotFoundException;
    User registerUser(RegisterUser newUser) throws ValidationException, InvalidOperationException, ObjectNotFoundException;
    User createLoginRequest(String userId, String password) throws ValidationException, InvalidOperationException, ObjectNotFoundException;
}