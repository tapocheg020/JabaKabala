public class Factory {
    public static void main(String[] args) {
    Factory table = new Factory();
    table.createTable();
    table.createTable("black");
    table.createTable("Blue", 10_000);
    table.createTable(20_000, "Yellow");
    }

    void createTable(){
        System.out.println("Создаю стол обычный пустой стандартный");
    }

    void createTable(String color){
        System.out.printf("Создаю стол с %s цветом\n", color);
    }


    void createTable(String color, int price){
        System.out.printf("Сделали стол с прайсом в %d, и цветом %s\n", price, color);
    }

    void createTable (int price, String color){
        System.out.printf("Сделали стол с прайсом в %d, и цветом %s дубля два типа перегрузка\n", price, color);
    }
}

//8:58 sborka proj.
