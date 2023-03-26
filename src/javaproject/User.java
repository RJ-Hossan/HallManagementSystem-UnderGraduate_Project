package javaproject;

class User {
    private int sno;
    private String content, date;
    
    public User(int sno, String content, String date){
        this.sno = sno;
        this.content = content;
        this.date = date;
        
    }
    public int getSL(){
        return sno;
    }
    public String getContent(){
        return content;
    }
    public String getDate(){
        return date;
    }
}
