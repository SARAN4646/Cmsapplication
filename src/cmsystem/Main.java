public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber, email);
                    contactManager.addContact(contact);
                    break;
                case 2:
                    contactManager.viewContacts();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContact(searchName);
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    contactManager.deleteContact(deleteName);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}