package moviereservation.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointRemoved extends AbstractEvent {

    private Long id;
    private String userid;
    private Integer point;
    private Date regDate;
    private String reason;

    public PointRemoved(Point aggregate) {
        super(aggregate);
    }

    public PointRemoved() {
        super();
    }
}
//>>> DDD / Domain Event
