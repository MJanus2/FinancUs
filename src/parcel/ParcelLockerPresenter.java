package parcel;

import java.util.Scanner;

public class ParcelLockerPresenter {
    private ParcelLockerService parcelLockerService = new ParcelLockerService();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wprowadź paczkomat");
            System.out.println("2. Wyświetl paczkomaty");
            int option = scanner.nextInt();
            switch (option) {
                case 1: insertParcelLocker(); break;
                case 2: showParcelLockers(); break;
            }
        } while (true);
    }

    public void insertParcelLocker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj nazwe: ");
        String name = scanner.nextLine();

        System.out.println("Podaj adres: ");
        String address = scanner.nextLine();

        System.out.println("Podaj ładowność: ");
        int capacity = scanner.nextInt();

        parcelLockerService.addParcelLocker(id, name, address, capacity);
    }

    public void showParcelLockers() {
        System.out.println("Dostępne paczkomaty: ");
        for (ParcelLocker parcelLocker : parcelLockerService.getParcelLockers()) {
            if (parcelLocker != null) {
                System.out.printf("Paczkomat: %d, %s, %s, %d\n",
                        parcelLocker.getId(),
                        parcelLocker.getName(),
                        parcelLocker.getAddress(),
                        parcelLocker.getCapacity());
            }
        }
    }
}
