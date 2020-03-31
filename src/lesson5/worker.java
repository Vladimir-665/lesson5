package lesson5;

class worker {
    String name;
    String position;
    String email;
    String telNumber;
    double salary;
    int age;


    worker(String name, String position, String email, String telNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
        this.email = email;
    }

    int GetAge() {
        return age;
    }
//    @Override
//    public String toString() {
//        return "worker{" +
//                "name='" + name + '\'' +
//                ", position='" + position + '\'' +
//                ", email='" + email + '\'' +
//                ", telNumber='" + telNumber + '\'' +
//                ", salary=" + salary +
//                ", age=" + age +
//                '}';
//    }
    void toConsole() {
        System.out.println(name + " " + position + " " + email + " " + telNumber + " " + salary + " " + age);
    }


    public static class Main {

        public static void main(String[] args) {
            worker[] workArray = new worker[5];
            workArray[0] = new worker("Ivanov I.I.(1)", "Engineer", "IvII@1.com", "+79050010101", 30000, 25);
            workArray[1] = new worker("Ivanov I.I.(2)", "Engineer", "IvII@2.com", "+79050010102", 35000, 30);
            workArray[2] = new worker("Ivanov I.I.(3)", "Engineer", "IvII@3.com", "+79050010103", 40000, 35);
            workArray[3] = new worker("Ivanov I.I.(4)", "Engineer", "IvII@4.com", "+79050010104", 50000, 45);
            workArray[4] = new worker("Ivanov I.I.(5)", "Engineer", "IvII@5.com", "+79050010105", 40000, 50);

            for(worker element : workArray) {
                if(element.GetAge() > 40) element.toConsole();
                }
            }
        }
    }
