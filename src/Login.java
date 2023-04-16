import java.io.IOException;
import java.util.Scanner;
public class Login {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Restoran> restoran = new ArrayList<>();
    public static ArrayList<Pesanan> pesanan = new ArrayList<>();
    private static String adminUsername = "admin";
    private static String adminPassword = "admin1234";
    private static String customerUsername = "customer";
    private static String customerPassword = "customer1234";
    public static void main(String[] args) throws IOException, InterruptedException{
        awal();
        loginMenu(scanner);
        loginAdmin(scanner);
        adminMenu(scanner);
        lihatRestoran();
        tambahRestoran(scanner);
        hapusRestoran(scanner);
        loginCustomer(scanner);
        customerMenu(scanner);
        buatPesanan(scanner);
        lihatPesanan();
        totalPesanan();
        close();
        clearScreen();
    }

    private static void loginMenu(Scanner scanner) throws IOException, InterruptedException{
        boolean isDone = false;
        while(!isDone){
            System.out.println(
                    "\n\t==============================================================" +
                            "\n\t||                 Selamat Datang di Program                ||" +
                            "\n\t||                         Buy Fast                         ||" +
                            "\n\t||``````````````````````````````````````````````````````````||" +
                            "\n\t||                          LOG IN                          ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| LOGIN SEBAGAI                                            ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| [1]. ADMIN                                               ||" +
                            "\n\t|| [2]. COSTUMER                                            ||" +
                            "\n\t||==========================================================||"
            );
            System.out.print(
                    "\n\t||==========================================================||" +
                            "\n\t|| MASUKKAN PILIHAN ANDA :"
            );


            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                case 1:
                    loginAdmin(scanner);
                    break;
                case 2:
                    loginCustomer(scanner);
                    break;
                default:
                    isDone = true;
                    System.out.println(
                            "\n\t==============================================================" +
                                    "\n\t||                 Selamat Datang di Program                ||" +
                                    "\n\t||                          Buy Fast                        ||" +
                                    "\n\t||``````````````````````````````````````````````````````````||" +
                                    "\n\t||                          LOG IN                          ||" +
                                    "\n\t||==========================================================||"
                    );
                    break;
            }
        }
    }
    private static void loginAdmin(Scanner scanner) throws IOException, InterruptedException{
        boolean isLoggedIn = false;
        String username, password;
        while (!isLoggedIn) {
            System.out.print(
                    "\n\t||==========================================================||" +
                            "\n\t|| Masukkan username Anda: "
            );
            username = scanner.nextLine();

            System.out.print(
                    "\t|| Masukkan password Anda: "
            );
            password = scanner.nextLine();

            System.out.print(
                    "\t||==========================================================||"
            );

            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                isLoggedIn = true;
                System.out.println(
                        "\n\t==============================================================" +
                                "\n\t||                 Selamat Datang di Program                ||" +
                                "\n\t||                          Buy Fast                        ||" +
                                "\n\t||``````````````````````````````````````````````````````````||" +
                                "\n\t||                          LOG IN                          ||" +
                                "\n\t||==========================================================||" +
                                "\n\t|| Anda berhasil login sebagai admin.                       ||" +
                                "\n\t||==========================================================||"
                );
                adminMenu(scanner);
            }else {
                System.out.println(
                        "\n\t==============================================================" +
                                "\n\t||                 Selamat Datang di Program                ||" +
                                "\n\t||                          Buy Fast                        ||" +
                                "\n\t||``````````````````````````````````````````````````````````||" +
                                "\n\t||                          LOG IN                          ||" +
                                "\n\t||==========================================================||" +
                                "\n\t|| Username atau password salah. Harap inputkan yang benar. ||" +
                                "\n\t||==========================================================||"
                );

            }
        }
    }
    private static void adminMenu(Scanner scanner2) throws IOException, InterruptedException{

        boolean isDone = false;
        while (!isDone) {
            System.out.println(
                    "\n\t==============================================================" +
                            "\n\t|| MENU ADMIN                                               ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| [1]. LIHAT RESTORAN                                      ||" +
                            "\n\t|| [2]. TAMBAH RESTORAN                                     ||" +
                            "\n\t|| [3]. HAPUS RESTORAN                                      ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| [0]. KELUAR PROGRAM                                      ||" +
                            "\n\t||==========================================================||"
            );
            System.out.print(
                    "\n\t||==========================================================||" +
                            "\n\t|| MASUKKAN PILIHAN ANDA:"
            );
            int choice = scanner2.nextInt();
            close();
            switch (choice) {
                case 1:
                    lihatRestoran();
                    break;
                case 2:
                    tambahRestoran(scanner);
                    break;
                case 3:
                    hapusRestoran(scanner);
                    break;
                case 0:
                    isDone = true;
                    System.out.print(
                            "\n\t||==========================================================||" +
                                    "\n\t|| Anda telah berhasil keluar dari program.                 ||" +
                                    "\n\t||==========================================================||"
                    );
                    break;
                default:
                    System.out.print(
                            "\n\t||==========================================================||" +
                                    "\n\t|| Harap inputkan pilihan yang benar.                       ||" +
                                    "\n\t||==========================================================||"
                    );
                    break;
            }
        }
    }

    public static void lihatRestoran() throws IOException, InterruptedException {

        if (restoran.size() == 0) {
            System.out.print(
                    "\n\t||==========================================================||" +
                            "\n\t|| TIDAK ADA RESTORAN                                       ||" +
                            "\n\t||==========================================================||"
            );
            close();
        } else {
            System.out.print(
                    "\n\t||==========================================================||" +
                            "\n\t|| RESTORAN                                                 ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| ID ||       NAMA RESTORAN                                  "

            );
            for (int i = 0; i < restoran.size(); i++) {
                System.out.print(
                        "\n\t||  " + (i+1) + ".\t" + restoran.get(i).getName().toUpperCase() +
                                "\n\t|| \t" + "Menu :" +
                                "\n\t|| \t" + (1) + ". " + restoran.get(i).menu.food + ", " + restoran.get(i).menu.priceFood +
                                "\n\t|| \t" + (2) + ". " + restoran.get(i).menu.drink + ", " + restoran.get(i).menu.priceDrink
                );
            }
            System.out.print(
                    "\n\t||==========================================================||"
            );
        }
    }

    private static void tambahRestoran(Scanner scanner) throws IOException, InterruptedException {

        System.out.print(
                "\n\t||==========================================================||"+
                        "\n\t|| INPUTKAN NAMA RESTORAN: "
        );
        String name = scanner.next();
        System.out.print(
                "\n\t||==========================================================||"+
                        "\n\t|| INPUTKAN ALAMAT RESTORAN: "
        );
        String address = scanner.next();
        System.out.print(
                "\n\t||==========================================================||"+
                        "\n\t|| INPUTKAN NAMA MAKANAN: "
        );
        String food = scanner.next();
        System.out.print(
                "\n\t||==========================================================||"+
                        "\n\t|| INPUTKAN NAMA MINUMAN: "
        );
        String drink = scanner.next();
        System.out.print(
                "\n\t||==========================================================||"+
                        "\n\t|| INPUTKAN HARGA MAKANAN: Rp."
        );
        int priceFood = scanner.nextInt();
        System.out.print(
                "\n\t||==========================================================||"+
                        "\n\t|| INPUTKAN HARGA MINUMAN: Rp."
        );
        int priceDrink = scanner.nextInt();
        restoran.add(new Restoran(name, address, new Menu(food, drink, priceFood, priceDrink)));

        System.out.println(
                "\n\t||==========================================================||"+
                        "\n\t|| " + name.toUpperCase() + " TELAH BERHASIL DITAMBAHKAN KE DAFTAR RESTORAN."+
                        "\n\t||==========================================================||"
        );
        close();
    }

    private static void hapusRestoran(Scanner scanner2) throws IOException, InterruptedException {

        lihatRestoran();
        System.out.print(
                "\n\t||==========================================================||"+
                        "\n\t|| INPUTKAN JUMLAH RESTORAN YANG INGIN DIHAPUS: "
        );
        int choice = scanner2.nextInt();

        if (choice < 1 || choice > restoran.size()) {
            System.out.print(
                    "\n\t||==========================================================||"+
                            "\n\t|| HARAP INPUTKAN PILIHAN YANG BENAR                        ||"+
                            "\n\t||==========================================================||"
            );
        } else {
            String name = restoran.get(choice-1).getName();
            restoran.remove(choice-1);
            System.out.print(
                    "\n\t||==========================================================||"+
                            "\n\t|| " + name.toUpperCase() + " TELAH BERHASIL DIHAPUS DARI DAFTAR RESTORAN."+
                            "\n\t||==========================================================||"
            );
        }
        close();
    }

    private static void loginCustomer(Scanner scanner) throws IOException, InterruptedException{
        boolean isLoggedIn = false;
        String username, password;
        while (!isLoggedIn) {
            System.out.print(
                    "\n\t||==========================================================||" +
                            "\n\t|| Masukkan username Anda: "
            );
            username = scanner.nextLine();

            System.out.print(
                    "\t|| Masukkan password Anda: "
            );
            password = scanner.nextLine();

            System.out.print(
                    "\t||==========================================================||"
            );

            if (username.equals(customerUsername) && password.equals(customerPassword)) {
                isLoggedIn = true;
                System.out.println(
                        "\n\t==============================================================" +
                                "\n\t||                 Selamat Datang di Program                ||" +
                                "\n\t||                          Buy Fast                        ||" +
                                "\n\t||``````````````````````````````````````````````````````````||" +
                                "\n\t||                          LOG IN                          ||" +
                                "\n\t||==========================================================||" +
                                "\n\t|| Anda berhasil login sebagai customer.                    ||" +
                                "\n\t||==========================================================||"
                );
                customerMenu(scanner);
            }else {
                System.out.println(
                        "\n\t==============================================================" +
                                "\n\t||                 Selamat Datang di Program                ||" +
                                "\n\t||                          Buy Fast                        ||" +
                                "\n\t||``````````````````````````````````````````````````````````||" +
                                "\n\t||                          LOG IN                          ||" +
                                "\n\t||==========================================================||" +
                                "\n\t|| Username atau password salah. Harap inputkan yang benar. ||" +
                                "\n\t||==========================================================||"
                );

            }
        }
    }
    private static void customerMenu(Scanner scanner2) throws IOException, InterruptedException{
        boolean isDone = false;
        while (!isDone) {
            System.out.println(
                    "\n\t==============================================================" +
                            "\n\t|| MENU CUSTOMER                                            ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| [1]. LIHAT RESTORAN                                      ||" +
                            "\n\t|| [2]. BUAT PESANAN                                        ||" +
                            "\n\t|| [3]. LIHAT PESANAN                                       ||" +
                            "\n\t|| [4]. TOTAL PESANAN                                       ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| [0]. KELUAR PROGRAM                                      ||" +
                            "\n\t||==========================================================||"
            );
            System.out.print(
                    "\n\t||==========================================================||" +
                            "\n\t|| MASUKKAN PILIHAN ANDA:"
            );
            int choice = scanner2.nextInt();
            close();
            switch (choice) {
                case 1:
                    lihatRestoran();
                    break;
                case 2:
                    buatPesanan(scanner);
                    break;
                case 3:
                    lihatPesanan();
                    break;
                case 4:
                    totalPesanan();
                    break;
                case 0:
                    isDone = true;
                    System.out.print(
                            "\n\t||==========================================================||" +
                                    "\n\t|| Anda telah berhasil keluar dari program.                 ||" +
                                    "\n\t||==========================================================||"
                    );
                    break;
                default:
                    System.out.print(
                            "\n\t||==========================================================||" +
                                    "\n\t|| Harap inputkan pilihan yang benar.                       ||" +
                                    "\n\t||==========================================================||"
                    );
                    break;
            }
        }
    }

    private static void totalPesanan(){

    }
    private static void buatPesanan(Scanner scanner2) {
    }

    private static void lihatPesanan() {
    }

    private static void awal() throws IOException, InterruptedException{
        System.out.println(
                "\n\t==============================================================" +
                        "\n\t||                                                          ||" +
                        "\n\t||                Selamat Datang di Program                 ||" +
                        "\n\t||                          Buy Fast                        ||" +
                        "\n\t||                                                          ||" +
                        "\n\t||==========================================================||" +
                        "\n\t||                    | BERANDA Buy Fast |                  ||" +
                        "\n\t||==========================================================||" +
                        "\n\t||             Program ini disusun dan dibuat oleh :        ||" +
                        "\n\t||                                                          ||" +
                        "\n\t||               Ni Komang Marsyani (2205551052)            ||" +
                        "\n\t||----------------------------------------------------------||" +
                        "\n\t||               Jurusan Teknologi Informasi                ||" +
                        "\n\t||                      Fakultas Teknik                     ||" +
                        "\n\t||                    Universitas Udayana                   ||" +
                        "\n\t||                           2023                           ||" +
                        "\n\t||----------------------------------------------------------||" +
                        "\n\t||             Tekan ENTER untuk melanjutkan                ||" +
                        "\n\t=============================================================="
        );
        scanner.nextLine();
        close();

    }
    public static void close() throws IOException, InterruptedException{

        System.out.println("\n\tBerikutnya...");
        System.out.println("\n\tTekan Enter untuk Melanjutkan...");
        scanner.nextLine();
        clearScreen();
    }

    public static void clearScreen() throws IOException, InterruptedException{
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
