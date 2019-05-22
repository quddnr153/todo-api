package bw.todo.api;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook lee on 2019-05-22
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RequiredArgsConstructor
@RestController
public class TodoController {
	private final TodoRepository todos;

	@GetMapping("/todos")
	public List<TodoDto> getTodos() {
		return todos.findAll()
			.stream()
			.map(TodoDto::new)
			.collect(Collectors.toList());
	}

	@GetMapping("/todos/{id}")
	public TodoDto getTodo(@PathVariable Long id) {
		return todos.findById(id)
			.map(TodoDto::new)
			.get();
	}

	@GetMapping("/todos/search")
	public List<TodoDto> searchTodos(@RequestParam String query) {
		return todos.findAllByTitleContainsIgnoreCase(query)
			.stream()
			.map(TodoDto::new)
			.collect(Collectors.toList());
	}

	@PostMapping("/todos")
	public TodoDto createTodo(@RequestBody @Valid TodoDto todoDto) {
		Todo createdTodo = todos.save(new Todo(todoDto));
		return new TodoDto(createdTodo);
	}

	@PutMapping("/todos")
	public TodoDto modifyTodo(@RequestBody @Valid TodoDto todoDto) {
		Todo modifiedTodo = todos.save(new Todo(todoDto));
		return new TodoDto(modifiedTodo);
	}
}
