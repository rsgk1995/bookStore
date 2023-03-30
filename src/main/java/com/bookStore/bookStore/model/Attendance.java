package com.bookStore.bookStore.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attendances")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private Date date;
    private String abspra;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eid", referencedColumnName="eid" )
    private Employee employee;
}
