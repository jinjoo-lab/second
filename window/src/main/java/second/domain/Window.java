package second.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import second.WindowApplication;

@Entity
@Table(name = "Window_table")
@Data
//<<< DDD / Aggregate Root
public class Window {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String type;

    public static WindowRepository repository() {
        WindowRepository windowRepository = WindowApplication.applicationContext.getBean(
            WindowRepository.class
        );
        return windowRepository;
    }
}
//>>> DDD / Aggregate Root
