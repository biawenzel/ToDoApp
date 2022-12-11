package ToDoApp;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class App {
   
    public static void main(String[] args) {        
        
        //cria��o do project controller
        ProjectController projectController = new ProjectController();
        
        //cria��o de novo projeto
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description");        
        projectController.save(project);       
        
        //cria��o da lista
        /*List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());*/
        
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        task.setIdProject(2);
        task.setName("Criar as telas da aplica��o");
        task.setDescription("Devem ser criadas telas para os cadastros");
        task.setNotes("Sem notas");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        
        taskController.save(task);
        
    }
}
