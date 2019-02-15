package CreationTypeDPDemos.simpleFactory;

public class HuangMenChicken implements  Food {
    @Override
    public void addSpicy(String spicy) {

    }

    @Override
    public void addCondiment(String condiment){
        System.out.println("taste delicious");
    }
}
