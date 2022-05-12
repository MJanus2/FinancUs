package com.financus.finance.realestates;

import java.util.Scanner;

public class RealEstatePresenter {
    private final RealEstateService realEstateService = new RealEstateService();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean closeMenu = true;
        do {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wprowadź apartament");
            System.out.println("2. Wyświetl apartament");
            System.out.println("3. Usuń apartament");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> insertRealEstate();
                case 2 -> showRealEstate();
                case 3 -> deleteRealEstate();
                case 4 -> closeMenu = false;
            }
        } while (closeMenu);
    }

    public void insertRealEstate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id: ");
        int id = scanner.nextInt();

        System.out.println("Podaj miasto: ");
        String city = scanner.nextLine();

        System.out.println("Podaj ulicę: ");
        String street = scanner.nextLine();

        System.out.println("Podaj metraż: ");
        int area = scanner.nextInt();

        System.out.println("Podaj miesięczny koszt obsługi: ");
        int monthlyCost = scanner.nextInt();

        System.out.println("Podaj piętro: ");
        int floor = scanner.nextInt();

        System.out.println("Czy jest parking (y/n): ");
        String ifParking = scanner.next();
        boolean parking;
        if (RealEstateValidator.isParkingValid(ifParking) && ifParking.equals("y")){
            parking = true;
        } else {
            System.out.println("Podaj y lub n, inne wartości są nieprawidłowe");
            parking = false;
        }


        if(realEstateService.addRealEstate(id, city, street, area, monthlyCost, floor, parking)){
            System.out.println("Dodano nieruchomość");
        } else {
            System.out.println("Podano błędne dane");
            insertRealEstate();
        }

    }

    public void showRealEstate() {
        System.out.println("Posiadane nieruchomości: ");
        for (Apartment apartment : realEstateService.getRealEstate()) {
            if (apartment != null) {
                System.out.print(apartment);
            }
        }
    }

    public void deleteRealEstate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id nieruchomości do usunięcia: ");
        int id = scanner.nextInt();
        realEstateService.deleteRealEstate(id);
    }
}
