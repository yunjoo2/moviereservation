package moviereservation.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import moviereservation.config.kafka.KafkaProcessor;
import moviereservation.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ReservationRepository reservationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Myinfoselected'"
    )
    public void wheneverMyinfoselected_ReservationCancellation(
        @Payload Myinfoselected myinfoselected
    ) {
        Myinfoselected event = myinfoselected;
        System.out.println(
            "\n\n##### listener ReservationCancellation : " +
            myinfoselected +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MovieSelected'"
    )
    public void wheneverMovieSelected_ReservationStarts(
        @Payload MovieSelected movieSelected
    ) {
        MovieSelected event = movieSelected;
        System.out.println(
            "\n\n##### listener ReservationStarts : " + movieSelected + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
