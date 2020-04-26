package tech.becloud.kea.control.service;

import tech.becloud.kea.control.model.rest.HostReservation;
import tech.becloud.kea.control.model.rest.Subnet4;

import java.util.List;

public interface ReservationsService {
    List<Subnet4> getIPv4Subnets();
    List<HostReservation> getIPv4Resevations(int subnetId);
    void addReservation(HostReservation hostReservation);
    void saveReservation(HostReservation hostReservation);
}
