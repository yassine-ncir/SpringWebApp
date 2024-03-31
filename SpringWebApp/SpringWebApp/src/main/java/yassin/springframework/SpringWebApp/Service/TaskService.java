package yassin.springframework.SpringWebApp.Service;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import yassin.springframework.SpringWebApp.repository.TaskRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService{
    private TaskRepository taskRepository;

    public List<Task> getTasks()
    {
        return taskRepository.findAll();
    }
}
