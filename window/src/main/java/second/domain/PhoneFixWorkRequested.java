package second.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import second.domain.*;
import second.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PhoneFixWorkRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    private String type;

    public PhoneFixWorkRequested(Window aggregate) {
        super(aggregate);
    }

    public PhoneFixWorkRequested() {
        super();
    }
}
//>>> DDD / Domain Event
