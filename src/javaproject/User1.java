package javaproject;

class User1 {
    private int id;
    private String content1, date1;
    
    public User1(int id, String content1, String date1){
        this.id = id;
        this.content1 = content1;
        this.date1 = date1;
        
    }
    public int getID(){
        return id;
    }
    public String getContent(){
        return content1;
    }
    public String getDate(){
        return date1;
    }
}
