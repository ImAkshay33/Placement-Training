


abstract public class Employee {
    private float salary;
    private String name;
    void setname(String name) {
        this.name=name;
    }
    String getname() {
        return name;
    }
    void setsalary(float salary) {
        this.salary = salary;
    }
    float getsalary() {
        return salary;  
    }
    abstract void bonus_cal();
    abstract void display_All();}
    class Manager extends Employee {
        private float bonus;
        void bonus_cal() {
            bonus = getsalary()*0.1f;
        }
        void display_All() {
            System.out.println("Manager Name: "+getname());
            System.out.println("Manager Salary: "+getsalary());
            System.out.println("Manager Bonus: "+bonus);
        }
    }
    class office_worker extends Employee {
        private float bonus;
        void bonus_cal() {
            bonus = getsalary()*0.05f;
        }
        void display_All() {
            System.out.println("Office Worker Name: "+getname());
            System.out.println("Office Worker Salary: "+getsalary());
            System.out.println("Office Worker Bonus: "+bonus);
        }
    }

    class developer extends Employee {
        private float bonus;
        void bonus_cal() {
            bonus = getsalary()*0.08f;
        }
        void display_All() {
            System.out.println("Developer Name: "+getname());
            System.out.println("Developer Salary: "+getsalary());
            System.out.println("Developer Bonus: "+bonus);
        }
    }

    class tester extends Employee {
        private float bonus;
        void bonus_cal() {
            bonus = getsalary()*0.07f;
        }
        void display_All() {
            System.out.println("Tester Name: "+getname());
            System.out.println("Tester Salary: "+getsalary());
            System.out.println("Tester Bonus: "+bonus);
        }
        public  void main(String[] args){
     display_All();
        }
    }