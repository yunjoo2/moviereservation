package moviereservation.infra;

import moviereservation.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyinfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Myinfo>> {

    @Override
    public EntityModel<Myinfo> process(EntityModel<Myinfo> model) {
        return model;
    }
}
