package org.contract.web.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.contract.dataaccess.data.models.Contract;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "response")
public class ContractListResponse {
    @XmlElementWrapper(name="contracts")
    @JacksonXmlProperty(localName = "contract")
    private List<Contract> contracts;

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
