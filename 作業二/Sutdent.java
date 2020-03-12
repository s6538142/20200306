public class Sutdent {

        public String name,color,id,grade,number;

        public Sutdent(){
            System.out.println("student1 object has created!");
        }
        public void setName(String newName){
            this.name=newName;
        }
        public String getName() {
            return this.name;
        }

        public void setColor(String newColor){
        this.color=newColor;

        }
        public String getColor(){
        return this.color;
    }
    public void setId(String newId){
        this.id=newId;

    }
    public String getId(){
        return this.id;
    }
    public void setGrade(String newGrade){
        this.grade=newGrade;
    }
    public String getGrade() {
        return this.grade;
    }
    public void setNumber(String newNumber){
        this.number=newNumber;
    }
    public String getNumber() {
        return this.number;
    }
        public String showInfo(){
            return this.getName()+"\t"+this.getColor()+"\t"+this.getId()+"\t"+this.getGrade()+"\t"+this.getNumber();
        }
    }

