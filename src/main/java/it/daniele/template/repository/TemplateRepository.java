package it.daniele.template.repository;

//@Repository
public interface TemplateRepository {//extends JpaRepository<Quiz, Long>,QuizExtendedRepository{
	/*
	
	@Query(value="select * from quiz where id in (select id_quiz from log where id = (select max(id) from log))", nativeQuery = true)
	public Quiz soluzione();
	*/
	
	
	
}
