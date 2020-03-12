public class Sutdent {

        public String name,color,id;

        public Sutdent(){
            System.out.println("student1 object has created!");
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

