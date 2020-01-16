package org.appointment.web.models;

import org.appointment.dataaccess.data.models.Appointment;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "response")
public class PaginatedAppointmentListResponse {
    @XmlElementWrapper(name="appointments")
    @XmlElement(name="appointment")
    private List<AppointmentResponse> appointments;
    private PaginationMetadata metadata;

    public List<AppointmentResponse> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<AppointmentResponse> appointments) {
        this.appointments = appointments;
    }

    public PaginationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PaginationMetadata metadata) {
        this.metadata = metadata;
    }
}
