package peaksoft.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import javax.validation.constraints.NotBlank;

@Builder
@Getter @Setter
public class Response {

    private HttpStatus httpStatus;

    private String message;
}
