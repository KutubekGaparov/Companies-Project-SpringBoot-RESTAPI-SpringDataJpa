package peaksoft.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class DateDto {
    private LocalDate start;
    private LocalDate finish;
}
