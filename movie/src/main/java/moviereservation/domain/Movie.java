package moviereservation.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moviereservation.MovieApplication;
import moviereservation.domain.MovieSelected;

@Entity
@Table(name = "Movie_table")
@Data
//<<< DDD / Aggregate Root
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String movieId;

    private String theaterId;

    private String startTime;

    private String endTime;

    private String director;

    private Integer seatCount;

    @PostPersist
    public void onPostPersist() {
        MovieSelected movieSelected = new MovieSelected(this);
        movieSelected.publishAfterCommit();
    }

    public static MovieRepository repository() {
        MovieRepository movieRepository = MovieApplication.applicationContext.getBean(
            MovieRepository.class
        );
        return movieRepository;
    }
}
//>>> DDD / Aggregate Root
