package second.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import second.domain.*;
import second.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PhoneFixWorked extends AbstractEvent {

    private Long id;
    private Long windowId;
    private Long userId;
    private String type;

    public PhoneFixWorked(Work aggregate) {
        super(aggregate);
    }

    public PhoneFixWorked() {
        super();
    }
}
//>>> DDD / Domain Event
