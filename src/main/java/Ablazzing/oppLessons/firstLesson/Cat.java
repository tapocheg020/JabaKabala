package Ablazzing.oppLessons.firstLesson;

public class Cat {
    public String color;
    public double weight;
    public String ownerName;

    public Cat(String colorCat, double weightCat, String ownerNameCat){
        this.color = colorCat;
        this.weight = weightCat;
        this.ownerName = ownerNameCat;
    }


    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот пидарас дерет диван %s сука блять", sofaOwner);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
