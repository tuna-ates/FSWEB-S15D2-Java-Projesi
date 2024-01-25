package setChallenge;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks ;
    private Set<Task> carolsTasks ;

    private Set<Task> unAssigned;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks
            ,Set<Task> unAssigned) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unAssigned=unAssigned;
    }

    public Set<Task> getTasks(String name){

            switch (name){
                case "ann":
                    return this.annsTasks;
                case "bob":
                    return this.bobsTasks;

                case "carol":
                    return this.carolsTasks;

                case "all":
                    return getUnion();

            }

        return new HashSet<>();
    }

    private Set<Task> getUnion() {
       Set<Task> allTask=new HashSet<>();
       allTask.addAll(annsTasks);
       allTask.addAll(bobsTasks);
       allTask.addAll(carolsTasks);

       return allTask;
    }

   public Set<Task> getDifferce(Set<Task> first,Set<Task> second){
        Set<Task> differce=new HashSet<>(first);

        differce.removeAll(second);
        return differce;
   }

    public Set<Task> getIntersect(Set<Task> first,Set<Task> second){
        Set<Task> differce=new HashSet<>(first);

        differce.retainAll(second);
        return differce;
    }



}
