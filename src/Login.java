import java.io.IOException;
import java.util.Scanner;
public class Login {
    public static Scanner scanner = new Scanner(System.in);
    private static String adminUsername = "admin";
    private static String adminPassword = "admin1234";
    private static String customerUsername = "customer";
    private static String customerPassword = "customer1234";
    public static void main(String[] args) throws IOException, InterruptedException{
        awal();
        loginMenu(scanner);
        loginAdmin(scanner);
        adminMenu(scanner);
        loginCustomer(scanner);
        customerMenu(scanner);
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
                            "\n\t|| ADMIN MENU                                               ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| [1]. VIEW RESTAURANT                                     ||" +
                            "\n\t|| [2]. ADD RESTAURANT                                      ||" +
                            "\n\t|| [3]. REMOVE RESTAURANT                                   ||" +
                            "\n\t||==========================================================||" +
                            "\n\t|| [0]. EXIT PROGRAM                                        ||" +
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
                    viewRestaurants();
                    break;
                case 2:
                    addRestaurant(scanner);
                    break;
                case 3:
                    removeRestaurant(scanner);
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

    private static void viewRestaurants() {
    }

    private static void addRestaurant(Scanner scanner2) {
    }

    private static void removeRestaurant(Scanner scanner2) {
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
        System.out.println("Bagian ini belum dibuat");
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
