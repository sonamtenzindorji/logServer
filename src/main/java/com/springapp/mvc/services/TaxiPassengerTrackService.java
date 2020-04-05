package com.springapp.mvc.services;

        import com.springapp.mvc.dao.TaxiPassengerTrackDao;
        import com.springapp.mvc.dto.PassengerDTO;
        import com.springapp.mvc.entity.PassengerEntity;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

/**
 * Created by Sonam Tenzin on 3/29/2020.
 */
@Service
public class TaxiPassengerTrackService {

    @Autowired
    private TaxiPassengerTrackDao taxiPassengerTrackDao;

    public PassengerDTO getPassengerDetail() {
        PassengerDTO passengerDTO=new PassengerDTO();
        passengerDTO.setPassengerName("Sonam Tenzin");
        passengerDTO.setContactNo("17598291");

        PassengerEntity passengerEntity=new PassengerEntity();
        passengerEntity.setPassengerName("Sonam Tenzin");
        passengerEntity.setContactNo("17598291");
        taxiPassengerTrackDao.getPassengerDetail(passengerEntity);
        return  passengerDTO;
    }
}
