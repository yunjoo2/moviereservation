package moviereservation.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moviereservation.MyinfoApplication;
import moviereservation.domain.Myinfoselected;

@Entity
@Table(name = "Myinfo_table")
@Data
//<<< DDD / Aggregate Root
public class Myinfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String userNm;

    private String pw;

    private String movieId;

    private String statu;

    private Integer point;

    @PostPersist
    public void onPostPersist() {
        Myinfoselected myinfoselected = new Myinfoselected(this);
        myinfoselected.publishAfterCommit();
    }

    public static MyinfoRepository repository() {
        MyinfoRepository myinfoRepository = MyinfoApplication.applicationContext.getBean(
            MyinfoRepository.class
        );
        return myinfoRepository;
    }
}
//>>> DDD / Aggregate Root
