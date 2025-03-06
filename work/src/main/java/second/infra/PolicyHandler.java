package second.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import second.config.kafka.KafkaProcessor;
import second.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PhoneFixWorkRequested'"
    )
    public void wheneverPhoneFixWorkRequested_PhoneFixWork(
        @Payload PhoneFixWorkRequested phoneFixWorkRequested
    ) {
        PhoneFixWorkRequested event = phoneFixWorkRequested;
        System.out.println(
            "\n\n##### listener PhoneFixWork : " +
            phoneFixWorkRequested +
            "\n\n"
        );

        // Sample Logic //
        Work.phoneFixWork(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
