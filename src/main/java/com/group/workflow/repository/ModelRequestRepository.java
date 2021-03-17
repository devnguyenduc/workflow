package com.group.workflow.repository;

import com.group.workflow.domain.ModelRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRequestRepository extends JpaRepository<ModelRequest, Long> {


}
