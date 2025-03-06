package second.domain;

import java.util.*;
import lombok.*;
import second.domain.*;
import second.infra.AbstractEvent;

@Data
@ToString
public class PhoneFixWorkRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    private String type;
}
