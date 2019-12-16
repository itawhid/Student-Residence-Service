package org.appointment.service.models;

import org.appointment.common.Messages;
import org.appointment.common.adapters.LocalDateAdapter;
import org.appointment.common.validation.annotations.HasValue;
import org.appointment.dataaccess.data.enums.AppointmentPriority;
import org.appointment.dataaccess.data.enums.AppointmentStatus;
import org.appointment.dataaccess.data.enums.AppointmentType;
import org.appointment.service.adapters.AppointmentPriorityAdapter;
import org.appointment.service.adapters.AppointmentStatusAdapter;
import org.appointment.service.adapters.AppointmentTypeAdapter;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "appointment")
public class NewAppointment {

    @HasValue(message = Messages.REQUIRED_CONTRACTORS_NAME)
    private String contractorsName;

    @HasValue(message = Messages.REQUIRED_ROOM_NUMBER)
    private String roomNumber;

    @NotNull(message = Messages.REQUIRED_APPOINTMENT_TYPE)
    private AppointmentType appointmentType;

    @HasValue(message = Messages.REQUIRED_ISSUE)
    private String issue;

    @NotNull(message = Messages.REQUIRED_APPOINTMENT_PRIORITY)
    private AppointmentPriority priority;

    @NotNull(message = Messages.REQUIRED_DESIRED_DATE)
    private LocalDate desiredDate;

    @NotNull(message = Messages.REQUIRED_APPOINTMENT_STATUS)
    private AppointmentStatus status;

    public String getContractorsName() {
        return contractorsName;
    }

    public void setContractorsName(String contractorsName) {
        this.contractorsName = contractorsName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }


    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }


    @XmlJavaTypeAdapter(AppointmentTypeAdapter.class)
    public AppointmentType getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(AppointmentType appointmentType) {
        this.appointmentType = appointmentType;
    }

    @XmlJavaTypeAdapter(AppointmentPriorityAdapter.class)
    public AppointmentPriority getPriority() {
        return priority;
    }

    public void setPriority(AppointmentPriority priority) {
        this.priority = priority;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getDesiredDate() {
        return desiredDate;
    }

    public void setDesiredDate(LocalDate desiredDate) {
        this.desiredDate = desiredDate;
    }

    @XmlJavaTypeAdapter(AppointmentStatusAdapter.class)
    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }


}
