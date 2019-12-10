package Endpoints;

import ProjectExceptions.NotImplementedException;
import Request.IRequest;
import Response.IResponse;

public interface IEndpoint {

	/**
	 * This method serves as the default execution for any Endpoint.
	 * @return Response Object for each of the request
	 */
	public IResponse root(IRequest requestObject) throws NotImplementedException;
	
}
