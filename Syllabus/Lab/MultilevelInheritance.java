class College{
    public void CollegeName(){
        System.out.println("MJCET");
    }
}

class Branch extends College{
    public void BranchName(){
        System.out.println("AIML");
    }
}

class Year extends Branch{
    public void YearNo(){
        System.out.println("2");
    }
}

class MultilevelInheritance{
    public static void main(String args[]){
        Year obj = new Year();
        obj.CollegeName();
        obj.BranchName();
        obj.YearNo();
    }
}