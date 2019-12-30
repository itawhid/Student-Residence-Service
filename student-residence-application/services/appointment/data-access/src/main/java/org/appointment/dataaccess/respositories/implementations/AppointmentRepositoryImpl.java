package org.appointment.dataaccess.respositories.implementations;

import org.appointment.common.Messages;
import org.appointment.common.exceptions.PaginationRangeOutOfBoundException;
import org.appointment.common.helpers.PaginationHelper;
import org.appointment.dataaccess.data.enums.AppointmentStatus;
import org.appointment.dataaccess.data.models.Appointment;
import org.appointment.dataaccess.helpers.Configuration;
import org.appointment.dataaccess.models.PaginatedDataList;
import org.appointment.dataaccess.respositories.interfaces.AppointmentRepository;
import org.daaaccess.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentRepositoryImpl implements AppointmentRepository {
	private static int id = 0;
	private  Storage storage =Storage.instance().build(Configuration.loadProperties("dbProperties.properties"));
	
	@Override
	public Appointment add(Appointment appointment) {
		appointment.setId(getNewId());
		storage.execute(appointment);
		
		//DataStore.appointments.add(appointment);

		return appointment;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Appointment> getAll() {
		
		//return new ArrayList<>(DataStore.appointments);
		return (List<Appointment>) storage.execute("appointment.findAll" , Appointment.class);
	}

	@Override
	public Appointment getById(String appointmentId) {
//		for(Appointment  appointment : DataStore.appointments){
//			if(appointment.getAppointmentId().equals(appointmentId)) {
//				return appointment;
//			}
//
//		}
		
		List<Appointment> appointmentList = (List<Appointment>) storage.execute("appointment.getAppointmentById" , Appointment.class);
		if(appointmentList.size()==0)
			return null;
		
		return appointmentList.get(0);
	}

	@Override
	public Appointment updateAppointmentStatus(String  appointmentId, AppointmentStatus status) {
		Appointment appointment = getById(appointmentId);
		if(appointment==null)
			return null;
		appointment.setStatus(status);
		storage.update(appointment);
		return appointment;
//		int appointmentIndex;
//		for(Appointment  appointment : DataStore.appointments){
//			if(appointment.getAppointmentId().equals(appointmentId)) {
//				appointmentIndex= DataStore.appointments.indexOf(appointment);			
//				appointment.setStatus(status);
//				DataStore.appointments.set(appointmentIndex, appointment);
//				return appointment;
//			}
//		
//		}
		
	
		//return null;
		
	}

	@Override
	public PaginatedDataList<Appointment> getAll(int pageNum, int pageSize) throws PaginationRangeOutOfBoundException {
	//	List<Appointment> appointmentList = DataStore.appointments;
		List<Appointment> appointmentList=getAll();

		return getPaginatedAppointmentList(pageNum, pageSize, appointmentList);
	}


	private synchronized int getNewId() {
		return ++id;
	}


	private PaginatedDataList<Appointment> getPaginatedAppointmentList(int pageNum, int pageSize, List<Appointment> appointmentList) throws PaginationRangeOutOfBoundException {
		PaginationHelper paginationHelper = new PaginationHelper(pageNum, pageSize, appointmentList.size());

		if (paginationHelper.isIndexOutOfRange()) {
			throw new PaginationRangeOutOfBoundException(Messages.PAGINATION_RANGE_EXCEEDS);
		}

		int startIndex = paginationHelper.getStartIndex();
		int endIndex = paginationHelper.getEndIndex();

		return new PaginatedDataList<Appointment>() {
			{
				setData(appointmentList.subList(startIndex, endIndex));
				setTotalDataCount(appointmentList.size());
			}
		};
	}

}
