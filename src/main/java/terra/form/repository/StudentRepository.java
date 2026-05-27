package terra.form.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import terra.form.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmailIgnoreCase(String email);
}
