package moviereservation.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MovieSelected extends AbstractEvent {

    private Long id;
    private String movieId;
    private String theaterId;
    private String director;
    private String startTime;
    private String endTime;

    public MovieSelected(Movie aggregate) {
        super(aggregate);
    }

    public MovieSelected() {
        super();
    }
}
//>>> DDD / Domain Event
