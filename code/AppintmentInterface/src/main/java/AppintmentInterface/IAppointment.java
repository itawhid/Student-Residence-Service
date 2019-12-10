package AppintmentInterface;

import Endpoints.IEndpoint;
import ProjectExceptions.NotImplementedException;
import Request.IRequest;
import Response.IResponse;

/**
 * Interface for implementing 
 * @author Kowshik Dipta Das Joy
 *
 */
public interface IAppointment extends IEndpoint{

/**
 * User should be able to request for appointment date.
 * @param requestObject
 * @return success or error with error message.
 * @throws NotImplementedException
 */
	
public IResponse requestAppointment(IRequest requestObject) throws NotImplementedException;
/**
 * User should get the list of his/her requested appointments .
 * @param requestObject
 * @return List of Appointments
 * @throws NotImplementedException
 */
public IResponse retriveAppointment(IRequest requestObject) throws NotImplementedException;

/**
 * Admin depending on the permission level they should be able retrive list of appointments. 
 * For Example: 
 * 		-super admin should get all the list. 
 * 		- House Master should get all the list as under
 * @param requestObject
 * @return List of Appointments
 * @throws NotImplementedException
 */
public IResponse getAppointmentList(IRequest requestObject) throws NotImplementedException;


/**
 * This method should only be accessed by admin types. As Ornob vai for permission here. 
 * He has already worked on this.
 * @param requestObject
 * @return Response Object
 * @throws NotImplementedException
 */
public IResponse changeAppointmentStatus(IRequest requestObject) throws NotImplementedException;
	
/**
 * 
 * If a user has made any appointment, he/she should be able to get the status of their message.
 * @param requestObject
 * @return response of the appointment
 * @throws NotImplementedException
 */
public IResponse getRequestedAppointmentStatus(IRequest requestObject) throws NotImplementedException;




}
