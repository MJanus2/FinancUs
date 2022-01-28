import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParcelLocker[] array = new ParcelLocker[100];
        boolean isProgramOpen = true;
        while (isProgramOpen) {
            System.out.println();
            System.out.println("1. dodanie paczkomatu");
            System.out.println("2. usunięcie paczkomatu");
            System.out.println("3. wyświetlanie wszystkich paczkomatów");
            System.out.println("4. wyświetlanie paczkomatów według nazwy miasta");
            System.out.println("5. dodanie paczki");
            System.out.println("6. usuwanie paczki");
            System.out.println("7. wyświetl paczki w paczkomacie");
            System.out.println("8. aktualizacja szczegółów paczek");
            int chooseIdOfOption = scanner.nextInt();
            if (chooseIdOfOption == 1) {
                String[] parcelLockerData = new String[2];
                for (int i = 0; i < 100; i++) {
                    if(array[i] == null) {
                        System.out.println("Podaj miasto w jakim znajduje się paczkomat" +
                                "(zamiast spacji użyj myślnika): ");
                        String cityOfParcelLocker = scanner.next();
                        System.out.println("Podaj ulicę na jakiej znajduje się paczkomat" +
                                "(zamiast spacji użyj myślnika): ");
                        String streetOfParcelLocker = scanner.next();
                        ;
                        System.out.println("Podaj ID paczkomatu: ");
                        int numberOfParcelLocker = scanner.nextInt();
                        array[i] = ParcelLocker.createParcelLocker(cityOfParcelLocker,
                                streetOfParcelLocker, numberOfParcelLocker);
                        System.out.println("Stworzono paczkomat o następujących właściwościach:");
                        System.out.println("Miasto: " + array[i].getCityOfParcelLocker());
                        System.out.println("Ulica: " + array[i].getStreetOfParcelLocker());
                        System.out.println("ID paczkomatu: " + array[i].getNumberOfParcelLocker());
                        break;
                    }
                }
            }
            if (chooseIdOfOption == 2) {
                System.out.println("Podaj ID paczkomatu do usunięcia: ");
                int parcelLockerIdToDelete = scanner.nextInt();
                for (int i = 0; i < array.length; i++) {
                    try {
                        if (parcelLockerIdToDelete == array[i].getNumberOfParcelLocker()) {
                            System.out.println("Usunięto paczkomat od ID: " +
                                    array[i].getNumberOfParcelLocker());
                            array[i] = null;
                        }
                    } catch (NullPointerException e) {
                    }
                }

            } if (chooseIdOfOption == 3) {
                for (int i = 0; i < 100; i++){
                    if (array[i] != null){
                        System.out.print("Paczkomat w " + array[i].getCityOfParcelLocker()
                                + " przy ulicy " + array[i].getStreetOfParcelLocker()
                                + " o ID: " + array[i].getNumberOfParcelLocker());
                        System.out.println();
                    }
                }
            }  {
                String choosenCiti = scanner.next();
                System.out.print("ID: ");
                for (int i = 0; i < 100; i++){
                    if (choosenCiti.equals(array[i].getCityOfParcelLocker())){
                        System.out.println(array[i].getNumberOfParcelLocker()+ ", ");
                    }
                }
            }if (chooseIdOfOption == 5){

            }


        }


    }



//* wyświetlanie paczek przez paczkomat
//* aktualizacja szczegółów paczek
}

