package InheritancePolimarphism.Polymarphism.MethodOverriding;

public class Student extends User {
    String batchName;
    Integer psp;

    @Override
    public void printUser(){
        System.out.println("Name:"+ name + ",Email:"+ email+", batch_name"+batchName+", psp"+ psp);
    }
}
