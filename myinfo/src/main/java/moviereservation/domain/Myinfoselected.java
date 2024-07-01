package moviereservation.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Myinfoselected extends AbstractEvent {

    private Long id;
    private String userId;
    private String userNm;
    private String pw;
    private String movieId;
    private String statu;

    public Myinfoselected(Myinfo aggregate) {
        super(aggregate);
    }

    public Myinfoselected() {
        super();
    }
}
//>>> DDD / Domain Event
