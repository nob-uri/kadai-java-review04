package animal;

public class Human extends Animal implements Thinkable {
    private String hobby;
    
    public Human() {
    }
    
    public Human(String name,int age,String hobby) {
        super(name,age);
        this.hobby = hobby;
    }
    
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    @Override
    public void say() {
        System.out.println(super.getName() + "です。" + super.getAge() + "歳です。");
    }

    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }
}
