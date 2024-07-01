package moviereservation.infra;

import moviereservation.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MovieHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Movie>> {

    @Override
    public EntityModel<Movie> process(EntityModel<Movie> model) {
        return model;
    }
}
