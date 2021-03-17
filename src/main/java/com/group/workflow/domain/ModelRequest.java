package com.group.workflow.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "emtabb", name = "model_request")
public class ModelRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date lastUpdatedDate;
    private String lastUpdatedBy;
}
