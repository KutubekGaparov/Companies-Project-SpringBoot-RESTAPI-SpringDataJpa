package peaksoft.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter @Setter
public class GroupRequest {

    private String groupName;

    private LocalDate dateOfStart;

    private LocalDate dateOfFinish;

}
