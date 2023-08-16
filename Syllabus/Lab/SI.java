class College{
    String CollegeName = "MJCET";
    int Year = 2;
    public void Name(){
        System.out.println(CollegeName);
    }
}
class Branch extends College{
    String BranchName = "AIML";
    public void Details(){
        System.out.println(BranchName);
    }
}

public class SI {
    public static void main(String args[]){
        Branch obj = new Branch();
        obj.Name();
        obj.Details();
        System.out.println("Year = " + obj.Year);
    }
}
