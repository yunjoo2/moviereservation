package moviereservation.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moviereservation.ReservationApplication;
import moviereservation.domain.Canceled;
import moviereservation.domain.Completed;

@Entity
@Table(name = "Reservation_table")
@Data
//<<< DDD / Aggregate Root
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String theaterId;

    private String seatNumber;

    private String movieId;

    private String userId;

    private Integer seatCount;

    @PostPersist
    public void onPostPersist() {
        Completed completed = new Completed(this);
        completed.publishAfterCommit();

        Canceled canceled = new Canceled(this);
        canceled.publishAfterCommit();
    }

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReservationApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void reservationCancellation(Myinfoselected myinfoselected) {
        //implement business logic here:

        /** Example 1:  new item 
        Reservation reservation = new Reservation();
        repository().save(reservation);

        Canceled canceled = new Canceled(reservation);
        canceled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(myinfoselected.get???()).ifPresent(reservation->{
            
            reservation // do something
            repository().save(reservation);

            Canceled canceled = new Canceled(reservation);
            canceled.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void reservationStarts(MovieSelected movieSelected) {
        //implement business logic here:

        /** Example 1:  new item 
        Reservation reservation = new Reservation();
        repository().save(reservation);

        Completed completed = new Completed(reservation);
        completed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(movieSelected.get???()).ifPresent(reservation->{
            
            reservation // do something
            repository().save(reservation);

            Completed completed = new Completed(reservation);
            completed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
