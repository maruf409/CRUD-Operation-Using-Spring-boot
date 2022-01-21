package code.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    @Id
    @GeneratedValue
    private Integer deptId;

    private String deptName;
    private String code;
    private String mobile;
}
