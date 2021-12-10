public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double weight = 100;
            double height = 1.9;
            double index = weight / ( height * height );
            System.out.println(index);
        }
}
