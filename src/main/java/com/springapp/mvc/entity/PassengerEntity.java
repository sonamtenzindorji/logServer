package com.springapp.mvc.entity;

import javax.persistence.*;

/**
 * Created by Sonam Tenzin on 3/29/2020.
 */
@Entity
@Table(name="passenger")
public class PassengerEntity {
    @Id
    @Column(name="PassengerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer passengerID;
    @Column(name="PassengerName")
    String passengerName;

    @Column(name="ContactNo")
    String contactNo;

    public Integer getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(Integer passengerID) {
        this.passengerID = passengerID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
