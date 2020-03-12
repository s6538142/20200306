public class Book1 {
    public String name,color,id,category,price;

    public Book1(){
        System.out.println("Book1 object has created!");
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
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
    public void setCategory(String newCategory){
        this.category=newCategory;

    }
    public String getCategory(){
        return this.category;
    }
    public void setPrice(String newPrice){
        this.price=newPrice;

    }
    public String getPrice(){
        return this.price;
    }
    public String showInfo(){

        return this.getName()+"\t"+this.getId()+"\t"+this.getColor()+"\t"+this.getCategory()+"\t"+this.getPrice();
    }
}
