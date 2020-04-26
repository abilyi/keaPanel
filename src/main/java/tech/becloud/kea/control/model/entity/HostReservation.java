package tech.becloud.kea.control.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HostReservation {
    private Integer id;
    private Integer subnetId;
    private Integer hostIdentifierType;
    private byte[] hostIdentifier;
    private String ipAddress;
}
