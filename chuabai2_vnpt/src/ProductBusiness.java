import java.util.LinkedList;
import java.util.Scanner;

public class ProductBusiness {
   static LinkedList<Product> listProduct = new LinkedList<>();
    public static void main(String[] args) {

        boolean isexit = true;
        Scanner scanner = new Scanner(System.in);

        while (isexit){
            System.out.println("***************Menu************");
            System.out.println("1.Nhập sản phẩm ");
            System.out.println("2.Đưa ra sản phầm có giá lớn nhất");
            System.out.println("3.Đưa ra sản phẩm cùng size");
            System.out.println("4.đưa ra sản phầm thuộc cùng loại");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn ");
            int select = scanner.nextInt();scanner.nextLine();
            switch (select){
                case 1:
                    System.out.println("bạn muốn nhập bao nhiêu sản phẩm ");
                    int number = scanner.nextInt();
                    inputDataForProdct(number);

                    // ở đây sẽ phải sử lý việc nhập sản phẩm


                    break;
                case 2:
                    System.out.println("*******Thông tin sản phẩm có giá lớn nhất*****");
                    Product product = getMaxPrice(listProduct);
                    System.out.println("Mã sản phẩm lớn nhất " + product.getId());
                    System.out.println("Name sản phẩm lớn nhất " + product.getName());
                    System.out.println("Gía sản phẩm lớn nhất " + product.getPrice());
                    //Đưa ra sản phầm có giá lớn nhất
                    break;
                case 3:
                    System.out.println("bạn chọn 3");
                    //Đưa ra sản phẩm cùng size
                    break;
                case 4:
                    System.out.println("bạn chọn 4");
                    //đưa ra sản phầm thuộc cùng loại
                    break;
                case 5:
                    System.out.println("bạn chọn 5");
                    // thoát khỏi chương trình
                    break;
                default:
                    System.out.println("lựa chọn phải từ 1->5");
                    break;

            }

        }


    }

    public static void  inputDataForProdct(int numberOfProduct){
        Scanner scanner = new Scanner(System.in);
        for (int i=0 ; i< numberOfProduct;i++){
            Product product = new Product();
            System.out.println("Nhập mã sản phẩm thứ "+(i+1) );
            product.setId( scanner.nextInt());scanner.nextLine();
            System.out.println("Nhập tên sản phẩm thứ " +(i+1));
            product.setName( scanner.nextLine());
            System.out.println("Nhập giá sản phẩm thứ " +(i+1));
            product.setPrice( scanner.nextInt());scanner.nextLine();
            System.out.println("Nhập size sản phẩm thứ " +(i+1));
            product.setSize( scanner.nextLine());
            System.out.println("Nhập loại sản phẩm thứ " +(i+1));
            product.setType( scanner.nextLine());
           Product product1 = product.inputData(product);
            listProduct.add(product1);
        }

    }
    public static Product getMaxPrice(LinkedList<Product> listProduct){
            if (listProduct.size() < 0){
                System.out.println("danh sách sản phẩm trống");

            }else {
                Product product = new Product();
             return   product.getMaxPrice(listProduct);
            }
            return null;

    }




}
