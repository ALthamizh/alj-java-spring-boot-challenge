package jp.co.axa.apidemo.entities.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeRequest {
    private Long id;
    private String name;
    private Integer salary;
    private String department;
}
