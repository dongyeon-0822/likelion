package week3.day2.collection;

public class Student {
    private int classNo;
    private String name;
    private String gitRepoAddress;

    public Student(int classNo, String name, String gitRepoAddress) {
        this.classNo = classNo;
        this.name = name;
        this.gitRepoAddress = gitRepoAddress;
    }
    public int getClassNo(){
        return this.classNo;
    }
    public String getName(){
        return this.name;
    }
    public String getGitRepoAddress(){
        return this.gitRepoAddress;
    }
}

