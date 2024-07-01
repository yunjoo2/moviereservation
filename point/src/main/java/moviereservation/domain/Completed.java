package moviereservation.domain;

import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

@Data
@ToString
public class Completed extends AbstractEvent {

    private Long id;
    private String theaterId;
    private String seatNumber;
    private String movieId;
    private String userId;
}
