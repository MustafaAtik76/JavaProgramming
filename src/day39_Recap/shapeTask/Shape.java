package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1 : Something went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1); // 1 : Something went wrong
        }
        this.name = name;
    }

    public Shape(String name) {
       setName(name);e;
    }
    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

}
