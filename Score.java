package score;
public class Score{
    public static void skorH(String name , int puan){
        System.out.println(name + " isimli oyuncunun skoru: " + puan);
    }
    public static void main(String[]args){
        skorH("Almila" , 30000);
        skorH("Ceren" , 5264);
        skorH("Tuğberk" , 965);
        
    }
}