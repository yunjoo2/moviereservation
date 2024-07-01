package moviereservation.domain;

import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

@Data
@ToString
public class Myinfoselected extends AbstractEvent {

    private Long id;
    private String userId;
    private String userNm;
    private String pw;
    private String movieId;
    private String statu;
}
