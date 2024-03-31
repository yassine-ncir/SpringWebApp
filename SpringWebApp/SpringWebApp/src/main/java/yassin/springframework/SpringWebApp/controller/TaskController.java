package yassin.springframework.SpringWebApp.controller;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yassin.springframework.SpringWebApp.Service.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class TaskController {
    private TaskService taskService;

    @GetMapping("/task")
    public List<Task> getTasks()
    {
        return taskService.getTasks();
    }


}
