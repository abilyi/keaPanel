package tech.becloud.kea.control.service.impl;

import tech.becloud.kea.control.model.rest.HostReservation;
import tech.becloud.kea.control.model.rest.Subnet4;
import tech.becloud.kea.control.service.ReservationsService;

import javax.inject.Singleton;
import java.util.List;

@Singleton

public class ReservationsServiceImpl implements ReservationsService {

    @Override
    public List<Subnet4> getIPv4Subnets() {
        return null;
    }

    @Override
    public List<HostReservation> getIPv4Resevations(int subnetId) {
        return null;
    }

    @Override
    public void addReservation(HostReservation hostReservation) {

    }

    @Override
    public void saveReservation(HostReservation hostReservation) {

    }
}
