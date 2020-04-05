package com.springapp.mvc.dao;

import com.springapp.mvc.dto.PassengerDTO;
import com.springapp.mvc.entity.PassengerEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Sonam Tenzin on 3/29/2020.
 */
@Repository
public class TaxiPassengerTrackDao {
    @PersistenceContext
    EntityManager em;

    @Transactional(rollbackOn = Exception.class)
    public void getPassengerDetail(PassengerEntity passengerEntity) {

        em.persist(passengerEntity);
        em.flush();

    }
}
