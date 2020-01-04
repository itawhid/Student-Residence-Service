package org.authentication.service.services.implementations;

import com.google.inject.Inject;
import org.authentication.dataaccess.data.models.Authentication;
import org.authentication.dataaccess.respositories.interfaces.AuthenticationRepository;
import org.authentication.service.models.NewAuthentication;
import org.authentication.service.services.interfaces.AuthenticationService;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class AuthenticationServiceImpl implements AuthenticationService {
	@Inject
	private AuthenticationRepository authenticationRepository;

	@Override
	public Authentication addAuthenticatedUser(NewAuthentication newAuthentication) {
		Authentication authentication = new Authentication() {
			{
				setUserId(newAuthentication.getUserId());
				setAccessToken(newAuthentication.getAccessToken());
				setGeneratedTime(newAuthentication.getGeneratedTime());
				setExpiryTime(newAuthentication.getExpiryTime());

			}
		};
		return authenticationRepository.add(authentication);
	}

	private Date toDate(LocalDateTime localDateTime) {
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}
}
