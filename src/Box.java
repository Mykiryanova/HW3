import java.util.ArrayList;

public class Box <T extends Fruit> {


    ArrayList<T> fruits1 = new ArrayList<>();
    public Box(T fruit1, T fruit2, T fruit3, T fruit4) {
        fruits1.add(fruit1);
        fruits1.add(fruit2);
        fruits1.add(fruit3);
        fruits1.add(fruit4);
    }
    ArrayList<T> fruits2 = new ArrayList<>();
    public Box(T fruit1, T fruit2) {
        fruits2.add(fruit1);
        fruits2.add(fruit2);

    }
    ArrayList<T> fruits3 = new ArrayList<>();
    public Box(T fruit1, T fruit2, T fruit3, T fruit4, T fruit5) {
        fruits3.add(fruit1);
        fruits3.add(fruit2);
        fruits3.add(fruit3);
        fruits3.add(fruit4);
        fruits3.add(fruit5);
    }

    public double getWeightBox(){
        return fruits1.get(0).getWeight()*fruits1.size();
    }
    public boolean compare(Box<?> anotherBox){
        return (this.getWeightBox() == anotherBox.getWeightBox());
    }
public boolean addingBoxApple(Box<T> anotherBox){
        return fruits1.addAll(anotherBox.fruits3);
}
    public boolean addingBoxOrange(Box<T> anotherBox){
        return fruits1.addAll(anotherBox.fruits2);
    }




}

