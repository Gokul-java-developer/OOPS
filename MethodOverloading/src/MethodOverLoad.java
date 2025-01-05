public class MethodOverLoad {

    public int add(int a, int b)
    {
        return a+b;
    }

//    public String add(int a, int b) //Method Overloading with return type
//    is not correct only with arguments can perform.
//    {
//        return "String";
//    }

    public String add(String fName, String lName)
    {
        return "Hello "+lName + ", " +fName;
    }
}
