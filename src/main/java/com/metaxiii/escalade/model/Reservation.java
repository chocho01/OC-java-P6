package com.metaxiii.escalade.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Getter
    @Setter
    @Id
    @Column( name = "id")
    private long id;

    @Getter
    @Setter
    @Column (name = "topo_id")
    private int topo_id;

    @Getter
    @Setter
    @Column (name = "request_user_id")
    private int request_user_id;
}
