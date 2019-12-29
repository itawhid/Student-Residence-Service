package org.authentication.service.models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.authentication.common.adapters.LocalDateAdapter;
import java.time.LocalDate;

public class Contract {
    private String contractId;
    private String contractorsName;
    private String contractorsUserId;
    private String contractorsEmail;
    private String contractorsPhone;
    private String roomNumber;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate startDate;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate endDate;
    private String contractStatus;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate createdOn;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }
    public String getContractorsName() {
        return contractorsName;
    }

    public void setContractorsName(String contractorsName) {
        this.contractorsName = contractorsName;
    }

    public String getContractorsUserId() {
        return contractorsUserId;
    }

    public void setContractorsUserId(String contractorsUserId) {
        this.contractorsUserId = contractorsUserId;
    }

    public String getContractorsEmail() {
        return contractorsEmail;
    }

    public void setContractorsEmail(String contractorsEmail) {
        this.contractorsEmail = contractorsEmail;
    }

    public String getContractorsPhone() {
        return contractorsPhone;
    }

    public void setContractorsPhone(String contractorsPhone) {
        this.contractorsPhone = contractorsPhone;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }
    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
}
