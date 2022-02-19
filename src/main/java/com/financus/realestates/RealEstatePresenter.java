package com.financus.realestates;

import java.util.Scanner;

public class RealEstatePresenter {
    private RealEstateService realEstateService = new RealEstateService();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wprowadź apartament");
            System.out.println("2. Wyświetl apartament");
            System.out.println("3. Usuń apartament");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertRealEstate();
                    break;
                case 2:
                    showRealEstate();
                    break;
                case 3:
                    deleteRealEstate();
                    break;
            }
        } while (true);
    }

    public void insertRealEstate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj miasto: ");
        String city = scanner.nextLine();

        System.out.println("Podaj ulicę: ");
        String street = scanner.nextLine();

        System.out.println("Podaj metraż: ");
        int area = scanner.nextInt();

        System.out.println("Podaj piętro: ");
        int floor = scanner.nextInt();

        System.out.println("Czy jest parking (y/n): ");
        String ifParking = scanner.next();
        boolean parking;
        if (ifParking.equals("y")){
            parking = true;
        } else {
            parking = false;
        }

        if(realEstateService.addRealEstate(id, city, street, area, floor, parking)){
            System.out.println("Dodano nieruchomość");
        } else {
            System.out.println("Podano błędne dane");
            insertRealEstate();
        }

    }

    public void showRealEstate() {
        System.out.println("Dostępne paczkomaty: ");
        for (Apartment apartment : realEstateService.getRealEstate()) {
            if (apartment != null) {
                System.out.printf(apartment.toString());
            }
        }
    }

    public void deleteRealEstate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id paczkomatu do usunięcia: ");
        int id = scanner.nextInt();
        realEstateService.deleteRealEstate(id);
    }
}
