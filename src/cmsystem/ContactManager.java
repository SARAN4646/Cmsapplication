class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    public void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Matching contact: " + contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching contact found.");
        }
    }

    public void deleteContact(String name) {
        boolean deleted = false;
        for (Contact contact : Contacts) 
        {
            if (contact.getName().equalsIgnoreCase(name))
            {
                Contacts.remove(contact);
                System.out.println(contact.getName() + " deleted successfully.");
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            System.out.println("Contact not found.");
        }
    }
}
