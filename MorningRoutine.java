public class MorningRoutine {
    public static void main (String[] args){
        ToDoList myToDoList=new ToDoList("My Morning Routine");
        myToDoList.addTask("Waking Up");
        myToDoList.addTask("Brushing Teeth");
        myToDoList.addTask("Drinking Tea");
        myToDoList.addTask("Eating Breakfast");
        myToDoList.display();
        myToDoList.removeTask(2);
        myToDoList.rename(1,"Stretching");
        myToDoList.addTask("Going Out");
        myToDoList.display();


    }
}
