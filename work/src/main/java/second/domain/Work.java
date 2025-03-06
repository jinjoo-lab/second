package second.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import second.WorkApplication;

@Entity
@Table(name = "Work_table")
@Data
//<<< DDD / Aggregate Root
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long windowId;

    private Long userId;

    private String type;

    public static WorkRepository repository() {
        WorkRepository workRepository = WorkApplication.applicationContext.getBean(
            WorkRepository.class
        );
        return workRepository;
    }

    //<<< Clean Arch / Port Method
    public static void phoneFixWork(
        PhoneFixWorkRequested phoneFixWorkRequested
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Work work = new Work();
        repository().save(work);

        */

        /** Example 2:  finding and process
        

        repository().findById(phoneFixWorkRequested.get???()).ifPresent(work->{
            
            work // do something
            repository().save(work);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
