package com.teamfour.articlecontrol.Repositorys;

import com.teamfour.articlecontrol.models.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewerRepository extends JpaRepository<Reviewer, Long> {
}
