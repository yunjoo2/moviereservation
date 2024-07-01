package moviereservation.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Completed extends AbstractEvent {

    private Long id;
    private String theaterId;
    private String seatNumber;
    private String movieId;
    private String userId;

    public Completed(Reservation aggregate) {
        super(aggregate);
    }

    public Completed() {
        super();
    }
}
//>>> DDD / Domain Event
