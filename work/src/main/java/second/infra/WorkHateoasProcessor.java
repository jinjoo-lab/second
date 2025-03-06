package second.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import second.domain.*;

@Component
public class WorkHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Work>> {

    @Override
    public EntityModel<Work> process(EntityModel<Work> model) {
        return model;
    }
}
