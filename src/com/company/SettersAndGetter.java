package com.company;
class Associate{
    private String name="xyz";
    private int Id=567;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int Id){
        this.Id= Id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }

}

public class SettersAndGetter {
    public static void main(String[] args) {
        Associate obj =new Associate();
        obj.setName("sushil");
        obj.setId(123);

        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}
