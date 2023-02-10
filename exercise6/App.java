public class App {
    public static void main(String[] args) throws Exception {
        
        Items i1 = new Snacks();
        i1.name = "Honeycomb";
        i1.price = 103;
        i1.showItemName();

        Items i2 = new Softdrinks();
        i2.name = "Sprite";
        i2.price = 45;
        i2.showItemName();

        Cashier c1 = new Cashier();

        System.out.println();

        c1.checkOut(i1);
        c1.checkPrice(i1);

        System.out.println();

        c1.checkOut(i2);
        c1.checkPrice(i2);

        System.out.println();

        System.out.println();

        Items [] iArr = new Items[2];
        iArr[0] = i1;
        iArr[1] = i2;
        int total = 0 ;
        for (int i = 0; i < iArr.length; i++){
            iArr[i].showItemName();
            System.out.println(iArr[i].price);

            total += iArr[i].price;
            
        }

        System.out.print("Total: " + total);

        System.out.println();
        System.out.println();

        Cat mycat = new Cat();

        mycat.eat();
    }
}
