public class Book1 {
    public String name,color,id;

    public Book1(){
        System.out.println("Book1 object has created!");
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
    public String showInfo(){

        return this.getName()+"\t id"+"\t green";
    }
}
