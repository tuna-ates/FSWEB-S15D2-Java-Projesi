import setChallenge.Priority;
import setChallenge.Status;
import setChallenge.Task;
import setChallenge.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

       Task taskForAnn=new Task("task","generaly config","ann", Priority.HIGH, Status.ASSIGNED);
       Task taskForAnn2=new Task("task","generaly config2","ann", Priority.HIGH, Status.IN_PROGRESS);

       Task taskForBob=new Task("task","bob config","bob",Priority.HIGH,Status.ASSIGNED);
       Task taskForBob2=new Task("task","bob config2","bob",Priority.MED,Status.IN_PROGRESS);

        Task taskForCarol=new Task("task","carol config","carol",Priority.HIGH,Status.ASSIGNED);
        Task taskForCarol2=new Task("task","carol config2","carol",Priority.LOW,Status.IN_PROGRESS);

        Task taskUnAssigned=new Task("task","dummy des",null,Priority.HIGH,Status.ASSIGNED);
        Task taskUnAssigned2=new Task("task","dummy des2",null,Priority.LOW,Status.IN_PROGRESS);

        Set<Task> annTasks=new HashSet<>();
        annTasks.add(taskForAnn);
        annTasks.add(taskForAnn2);

        Set<Task> bobTasks=new HashSet<>();
        bobTasks.add(taskForBob);
        bobTasks.add(taskForBob2);

        Set<Task> carolTasks=new HashSet<>();
        carolTasks.add(taskForCarol);
        carolTasks.add(taskForCarol2);

        Set<Task> unAssigned =new HashSet<>();
        unAssigned.add(taskUnAssigned);
        unAssigned.add(taskUnAssigned2);

        Set<Task> allTasks =new HashSet<>();
        allTasks.addAll(annTasks);
        allTasks.addAll(bobTasks);
        allTasks.addAll(carolTasks);
        allTasks.addAll(unAssigned);

        System.out.println("----------1--------------------");
        TaskData taskData=new TaskData(annTasks,bobTasks,carolTasks,unAssigned);
        System.out.println( taskData.getTasks("all").toString());
        System.out.println("----------------2------------------");
        System.out.println( taskData.getTasks("ann").toString());
        System.out.println( taskData.getTasks("bob").toString());
        System.out.println( taskData.getTasks("carol").toString());

        System.out.println(  taskData.getDifferce(allTasks,taskData.getTasks("all")).toString());;


    }
}