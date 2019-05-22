package bw.todo.api;

import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Byungwook lee on 2019-05-22
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Getter
public class TodoDto {
	private Long id;
	@NotNull
	@NotBlank
	private String title;
	@NotNull
	@NotBlank
	private String description;
	@Min(1)
	@Max(10)
	private Integer priority;
	@NotNull
	private Status status;

	public TodoDto() {
	}

	public TodoDto(Todo todo) {
		this.id = todo.getId();
		this.title = todo.getTitle();
		this.description = todo.getDescription();
		this.priority = todo.getPriority();
		this.status = todo.getStatus();
	}
}
