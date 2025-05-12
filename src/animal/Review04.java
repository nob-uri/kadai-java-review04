package animal;

public class Review04 {

    public static void main(String[] args) {
        Human human[] = new Human[3];
        
        human[0] = new Human("田中 太郎",25,"電車");
        human[1] = new Human("鈴木 次郎",30,"野球");
        human[2] = new Human("佐藤 花子",20,"映画");
        
        newTalk(human);
    }
        public static void newTalk(Human[] human) {
            for(Human man : human) {
                man.say();
                man.think();
            }
        }
    
}
