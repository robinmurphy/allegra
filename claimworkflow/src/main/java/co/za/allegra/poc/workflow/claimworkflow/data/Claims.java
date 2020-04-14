package co.za.allegra.poc.workflow.claimworkflow.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CLAIMS")
public class Claims {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "FIRST_NAME")
    private String firtName;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
}
