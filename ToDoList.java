import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;

public class ToDoList{
    private String topic;
    private ArrayList<String> tasks;

    public ToDoList(String topic){
        this.topic=topic;
        this.tasks=new ArrayList<String>();

    }
    public void addTask(String taskName){
        this.tasks.add(taskName);
    }
    public void display(){
        if(tasks.size()==0){
            System.out.println("Our ToDoList "+topic+" is currently empty");
        }else{
            System.out.println("Here is our ToDo List "+topic);
            for(int i=0;i<=this.tasks.size();i++){
                System.out.println("Task "+i+" is "+this.tasks.get(i));
            }
        }
    }
    public void removeTask(int i){
        try{
            this.tasks.remove(i);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("No index at this position");
        }
        

    }
    public void rename(int i, String newTask){
        try{
            this.tasks.set(i,newTask);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("No task at this index");
        }
    }
}
