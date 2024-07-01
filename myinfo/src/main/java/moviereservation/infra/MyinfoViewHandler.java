package moviereservation.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import moviereservation.config.kafka.KafkaProcessor;
import moviereservation.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class MyinfoViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MyinfoRepository myinfoRepository;
    //>>> DDD / CQRS
}
