package bw.todo.api;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Byungwook lee on 2019-05-22
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
