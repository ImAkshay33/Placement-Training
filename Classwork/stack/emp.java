import java.util.*;
class Employee{
    int id;
    String name;
    Employee(int id,String name){
    this.id=id;
    this.name=name;}
}
public class emp {
    public static void main(String [] args){
    Stack<Employee> st=new Stack<>();
    st.push(new Employee(01,"AKshay"));
    st.push(new Employee(02,"Krishna"));
    st.push(new Employee(03,"nfnfjv"));
    while(!st.empty()){
        Employee e=st.pop();
        System.out.println("ID : "+e.id+"\nNAME : "+e.name);
    }
}}
