class Management{}
class Schools extends Management {
    void schoolInfo() {
        System.out.println("School management");
    }
}
class Teachers extends Schools {
    void teacherInfo() {
        System.out.println("Teacher management");
    }
}
class Workers extends Teachers {
    void workerInfo() {
        System.out.println("Worker management");
    }
}
class type1 extends Workers {
    void studentInfo() {
        System.out.println("type1 management");
    }
}
class College extends Management {
    void collegeInfo() {
        System.out.println("College management");
    }
}
class Professors extends College {
    void professorInfo() {
        System.out.println("Professor management");
    }
}
class Transport extends Professors {
    void transportInfo() {
        System.out.println("Transport management");
    }
}
class type2 extends Transport {
    void studentInfo() {
        System.out.println("type2 management");
    }
}
class Placement extends Management {
    void placementInfo() {
        System.out.println("Placement management");
    }
}
class Staffs extends Placement {
    void staffInfo() {
        System.out.println("Staff management");
    }
}
class Company extends Staffs {
    void companyInfo() {
        System.out.println("Company management");
    }
}
class Training extends Company {
    void trainingInfo() {
        System.out.println("Training management");
    }
}
class type3 extends Training {
    void singleStudentInfo() {
        System.out.println("type3 management");
    }
}

public class inheritance {
    public static void main(String args[]){
        
        type1 t1 = new type1();
        t1.schoolInfo();
        t1.teacherInfo();
        t1.workerInfo();
        t1.studentInfo();

        type2 t2 = new type2();
        t2.collegeInfo();
        t2.professorInfo();
        t2.transportInfo();
        t2.studentInfo();

        type3 t3 = new type3();
        t3.placementInfo();
        t3.staffInfo(); 

      
}}
