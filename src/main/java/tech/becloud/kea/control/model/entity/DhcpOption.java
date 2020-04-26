package tech.becloud.kea.control.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DhcpOption {
    private Integer reservationId;
    private String option;
    private int numericOption;
    private String value;
}
