package hello.hellospring.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
public class Member {

    @Id
    private Long id;

    @Column
    private String Name;

}
