package moviereservation.domain;

import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

@Data
@ToString
public class MovieSelected extends AbstractEvent {

    private Long id;
    private String movieId;
    private String theaterId;
    private String director;
    private String startTime;
    private String endTime;
}
