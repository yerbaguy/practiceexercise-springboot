package com.ebartmedia.practiceexercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ebartmedia.practiceexercise.model.Wordnumber;

@Repository
public interface WordnumberRepository extends JpaRepository<Wordnumber, Integer> {
	
	
	
//	@Modifying
//	@Transactional
//	@Query("UPDATE Wordnumber r SET r.wordnumber= :wordnumber WHERE r.id=1")
//	void updwordnumber(@Param("wordnumber") int wordnumber);

	
	@Modifying
	@Transactional
	@Query("UPDATE Wordnumber r SET r.wordnumber= :wordnumber WHERE r.id=1")
	void updwordnumber(@Param("wordnumber") Float wordnumber);

	
}
