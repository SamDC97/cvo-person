package be.cvo.person.service;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonDTO {
    private Integer id;
    private String name;
}
